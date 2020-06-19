package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagsController {
    HashtagsStorage hashtagsStorage;
    CategoryStorage categoryStorage;


    public HashtagsController(HashtagsStorage hashtagsStorage, CategoryStorage categoryStorage) {
        this.hashtagsStorage = hashtagsStorage;
        this.categoryStorage = categoryStorage;
    }


    @GetMapping("tags/{hashtag}")
    public String showSingleHashtag(@PathVariable String hashtag, Model model) {
        model.addAttribute("hashtag", hashtagsStorage.findHashtagByName(hashtag));
        model.addAttribute("categories", categoryStorage.getAllCategories());
        return "hashtag-template";
    }

    @PostMapping("/tags/add")
    public String addHashtag(String hashtag) {
        if (hashtagsStorage.findHashtagByName(hashtag) != null) {
            return "redirect:/";
        }
        Hashtags hashtagsToAdd = new Hashtags(hashtag);
        hashtagsStorage.addHashtags(hashtagsToAdd);
        return "redirect:/";
    }



}
