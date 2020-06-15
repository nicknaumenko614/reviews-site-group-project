package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {

    Map<String, Category> categories = new HashMap<>();

    public CategoryStorage() {
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American Actor and Filmmaker", "BenThereDoneThat",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5", "A good ol’ boy from Bas-tan.", "Actor");
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin  was an American polymath", "Ben", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5", "A figure who revolutionized American history and modern society", "Historical Figure");
        Ben ben3 = new Ben ("Ben Kingsley", "Actor", "12/31/1943", "Sir Ben Kingsley (Krishna Pandit Bhanji) is an English actor with a\n" +
                "          career spanning over 50 years.", "Ben", "../../images/ben-kingsley.jfif", "5 out of 5", "A classy man and Sexy Beast, Ben Kingsley has been a part of many of\n" +
                "            our current favorite movies. ", "Actor");
        Ben ben4 = new Ben ("Ben Banneker", "Author", "11/9/1731", "Benjamin Banneker was a free African-American almanac author,\n" +
                "          surveyor, naturalist, and farmer.", "BenThereDoneThat", "../../ben-banneker.jpg", "5 out of 5", "With the ability to teach himself with no next to no education is\n" +
                "          nothing short of remarkable.", "Historical Figure");

        ArrayList<Ben> actorBens = new ArrayList<>();
        actorBens.add(ben1);
        actorBens.add (ben3);
        categories.put("Actors", new Category("Actors", actorBens));

        ArrayList<Ben> historicalBens = new ArrayList<>();
        historicalBens.add(ben2);
        historicalBens.add(ben4);
        categories.put("Historical Figures", new Category("Historical Figures", historicalBens));

    }

    public Category findCategoryByName(String category) {
        return categories.get(category);

    }

    public Collection<Category> getAllCategories() {
        return categories.values();
    }
}
