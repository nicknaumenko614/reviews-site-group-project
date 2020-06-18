package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class BenController {

    private BenStorage benStorage;
    private CategoryStorage categoryStorage;

    public BenController(BenStorage benStorage, CategoryStorage categoryStorage) {
        this.benStorage = benStorage;
        this.categoryStorage = categoryStorage;
    }

    @GetMapping("bens/{benName}")
    public String showSingleBen(@PathVariable String benName, Model model) {
        model.addAttribute("ben", benStorage.getBenByName(benName));
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "review-template";
    }

    @PostMapping("bens/add")
    public String addSingleBen(String name, String profession, String birthDate, String bio,
                               String reviewScore, String reviewText, String category) {
        if (benStorage.getBenByName(name) != null) {
            return "redirect:/";
        }
        long categoryID = Long.parseLong(category);
        Category categoryToAdd = categoryStorage.findCategoryByID(categoryID).get();
        Ben benToAdd = new Ben(name, profession, birthDate, bio, "Ben Franklin", reviewScore,
                reviewText, categoryToAdd);
        benStorage.addBen(benToAdd);
        return "redirect:/";
    }
}
