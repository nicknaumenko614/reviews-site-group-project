package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    BenRepository benRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    HashtagsRepository hashtagsRepo;

    @Override
    public void run(String... args) throws Exception {
        Category actors = new Category("Actors");
        Category historicalFigures = new Category("Historical Figures");
        categoryRepo.save(actors);
        categoryRepo.save(historicalFigures);
        Hashtags hashtags1 = new Hashtags("BenThereDoneThat");
        Hashtags hashtags2 = new Hashtags("Ben");
        hashtagsRepo.save(hashtags1);
        hashtagsRepo.save(hashtags2);
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American Actor and Filmmaker",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5",
                "A good ol’ boy from Bas-tan.", actors, hashtags1);
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin  was an American polymath", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5", "A figure who revolutionized American history and modern society", historicalFigures, hashtags2);
        Ben ben3 = new Ben("Ben Kingsley", "Actor", "12/31/1943", "Sir Ben Kingsley (Krishna Pandit Bhanji) is an English actor with a\n" +
                "          career spanning over 50 years.", "../../images/ben-kingsley.jfif", "5 out of 5", "A classy man and Sexy Beast, Ben Kingsley has been a part of many of\n" +
                "            our current favorite movies. ", actors, hashtags2);
        Ben ben4 = new Ben("Ben Banneker", "Author", "11/9/1731", "Benjamin Banneker was a free African-American almanac author,\n" +
                "          surveyor, naturalist, and farmer.", "../../images/ben_banneker.jpg", "5 out of 5", "With the ability to teach himself with no next to no education is\n" +
                "          nothing short of remarkable.", historicalFigures, hashtags1, hashtags2);
        benRepo.save(ben1);
        benRepo.save(ben2);
        benRepo.save(ben3);
        benRepo.save(ben4);

    }
}
