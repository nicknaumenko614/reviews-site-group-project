package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {
    @Autowired
    private BenRepository benRepo;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private HashtagsRepository hashtagsRepo;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void categoryCanHaveMultipleBens() {
        Category testCategory = new Category ("Test Category");
        categoryRepo.save(testCategory);
        Hashtags hashtags1 = new Hashtags("Test Hashtag");
        hashtagsRepo.save(hashtags1);
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American Actor and Filmmaker",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5",
                "A good ol’ boy from Bas-tan.", testCategory, hashtags1);
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin  was an American polymath", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5", "A figure who revolutionized American history and modern society",
                testCategory, hashtags1);
        benRepo.save(ben1);
        benRepo.save(ben2);
        entityManager.flush();
        entityManager.clear();

        Category retrievedCategory = categoryRepo.findById(testCategory.getId()).get();
        assertThat(retrievedCategory).isEqualTo(testCategory);
        assertThat(retrievedCategory.getBens()).containsExactlyInAnyOrder(ben1, ben2);
    }

    @Test
    public void hashtagsCanHaveMultipleBens() {
        Category testCategory = new Category ("Test Category");
        categoryRepo.save(testCategory);
        Hashtags hashtags1 = new Hashtags("Test Hashtag");
        Hashtags hashtags2 = new Hashtags("Test Hashtag 2");
        hashtagsRepo.save(hashtags1);
        hashtagsRepo.save(hashtags2);
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American Actor and Filmmaker",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5",
                "A good ol’ boy from Bas-tan.", testCategory, hashtags1);
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin  was an American polymath", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5", "A figure who revolutionized American history and modern society",
                testCategory, hashtags1);
        benRepo.save(ben1);
        benRepo.save(ben2);
        entityManager.flush();
        entityManager.clear();

        Hashtags retrievedHashtag = hashtagsRepo.findById(hashtags1.getId()).get();
        assertThat(retrievedHashtag).isEqualTo(hashtags1);
    }



}
