package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BenController {

    private BenStorage benStorage;
    private CategoryStorage categoryStorage;

    public BenController(BenStorage benStorage, CategoryStorage categoryStorage) {
        this.benStorage = benStorage;
        this.categoryStorage = categoryStorage;
    }
    @RequestMapping("bens/{benName}" )
    public String showSingleBen(@PathVariable String benName, Model model){
        model.addAttribute("ben", benStorage.getBenByName(benName));
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "review-template";
    }

}
