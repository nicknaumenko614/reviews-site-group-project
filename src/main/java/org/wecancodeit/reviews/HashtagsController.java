package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HashtagsController {
    HashtagsStorage hashtagsStorage;

    public HashtagsController(HashtagsStorage hashtagsStorage) {
        this.hashtagsStorage = hashtagsStorage;
    }
    @RequestMapping("tags/{hashtag}")
    public String showSingleHashtag(@PathVariable String hashtag, Model model){
        model.addAttribute("hashtag",hashtagsStorage.findHashtagByName(hashtag));
        return "hashtag-template";

    }
}
