package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Populator {
    @Autowired
    BenRepository benRepo;
    @Autowired
    CategoryRepository categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        Category actors = new Category ("Actors");
        Category historicalFigures = new Category ("Actors");
    }

    Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
            "American Actor and Filmmaker", "BenThereDoneThat",
            "../../images/Ben_Affleck.jpg", "4.25 out of 5", "A good ol’ boy from Bas-tan.", "Actor");
    Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
            "Benjamin Franklin  was an American polymath", "Ben", "../../images/Benjamin_Franklin.jpg",
            "5 out of 5", "A figure who revolutionized American history and modern society",  "Historical Figure");
    Ben ben3 = new Ben ("Ben Kingsley", "Actor", "12/31/1943", "Sir Ben Kingsley (Krishna Pandit Bhanji) is an English actor with a\n" +
            "          career spanning over 50 years.", "Ben", "../../images/ben-kingsley.jfif", "5 out of 5", "A classy man and Sexy Beast, Ben Kingsley has been a part of many of\n" +
            "            our current favorite movies. ", "Actor");
    Ben ben4 = new Ben ("Ben Banneker", "Author", "11/9/1731", "Benjamin Banneker was a free African-American almanac author,\n" +
            "          surveyor, naturalist, and farmer.", "BenThereDoneThat", "../../images/ben_banneker.jpg", "5 out of 5", "With the ability to teach himself with no next to no education is\n" +
            "          nothing short of remarkable.", "Historical Figure");
}
