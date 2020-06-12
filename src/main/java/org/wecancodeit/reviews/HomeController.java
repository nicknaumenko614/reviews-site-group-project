package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    HashtagsStorage hashtagsStorage;
    CategoryStorage categoryStorage;

    public HomeController(HashtagsStorage hashtagsStorage, CategoryStorage categoryStorage) {
        this.hashtagsStorage = hashtagsStorage;
        this.categoryStorage = categoryStorage;
    }

    @RequestMapping({"", "/"})

    public String showHome(Model model) {
        model.addAttribute("categories", categoryStorage.getAllCategories());
        model.addAttribute("hashtags", hashtagsStorage.getAllHashtags());
        return "home-template";

    }

}
