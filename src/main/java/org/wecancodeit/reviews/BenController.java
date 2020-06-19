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
    private HashtagsStorage hashtagsStorage;

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

    @PostMapping("/bens/add")
    public String addSingleBen(String name, String profession, String birthDate, String bio,
                               String url, String reviewScore, String reviewText, long category) {
        if (benStorage.getBenByName(name) != null) {
            return "redirect:/";
        }
        Category categoryToAdd = categoryStorage.findCategoryByID(category).get();
        Ben benToAdd = new Ben(name, profession, birthDate, bio, url, reviewScore,
                reviewText, categoryToAdd);
        benStorage.addBen(benToAdd);
        return "redirect:/";
    }

    @PostMapping("/bens/tags/add")
    public String addHashtag(long id, String hashtag) {
        Ben ben = benStorage.findByID(id);
        if (hashtagsStorage.findHashtagByName(hashtag) != null) {
            Hashtags hashtagToAdd = hashtagsStorage.findHashtagByName(hashtag);
            ben.addHashtags(hashtagToAdd);
            return "redirect:/";
        }
        Hashtags hashtagsToAdd = new Hashtags(hashtag);
        hashtagsStorage.addHashtags(hashtagsToAdd);
        ben.addHashtags(hashtagsToAdd);
        return "redirect:/";
    }
}
