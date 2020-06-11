package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BenController {

    private BenStorage benStorage;

    public BenController(BenStorage benStorage) {
        this.benStorage = benStorage;
    }
    @RequestMapping("bens/{benName}" )
    public String showSingleBen(@PathVariable String benName, Model model){
        model.addAttribute("ben", benStorage.getBenByName(benName));
        return "review-template";
    }

}
