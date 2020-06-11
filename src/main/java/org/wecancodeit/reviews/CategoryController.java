package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController {
    Map<String, Category> categories = new HashMap<>();
    public CategoryController(){
        Ben ben1 = new Ben("Ben Affleck","Actor", "08/15/1972",
                "American Actor and Filmmaker", "BenThereDoneThat",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5", "A good ol’ boy from Bas-tan.");
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "enjamin Franklin (January 17, 1706 – April 17, 1790) was an American polymath", "Ben", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5",  "A figure who not only revolutionized American history but also modern" +
                "          society");
        ArrayList<Ben> allBens = new ArrayList<>();
        allBens.add(ben1);
        allBens.add(ben2);
        categories.put("Actors", new Category("Actors", allBens));
    }

    @RequestMapping("catergories/{category}")

}

