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
        Category athletes = new Category("Athletes");
        categoryRepo.save(actors);
        categoryRepo.save(historicalFigures);
        categoryRepo.save(athletes);
        Hashtags hashtags1 = new Hashtags("BenThereDoneThat");
        Hashtags hashtags2 = new Hashtags("Ben");
        Hashtags hashtags3 = new Hashtags("BenAHotMinute");
        Hashtags hashtags4 = new Hashtags("BenCommandments");
        hashtagsRepo.save(hashtags1);
        hashtagsRepo.save(hashtags2);
        hashtagsRepo.save(hashtags3);
        hashtagsRepo.save(hashtags4);
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American actor and filmmaker Benjamin Géza Affleck-Boldt was born on " +
                        "August 15, 1972 in Berkeley, California, and was raised in Cambridge, " +
                        "Massachusetts. His mother, Chris Anne (née Boldt), is a school " +
                        "teacher, and his father, Timothy Byers Affleck, is a social worker; " +
                        "the two are divorced.",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5",
                "A good ol’ boy from Bas-tan. Ben of the Afflecks has been gracing the " +
                        "screens for almost 3 decades now. Over that time he’s seen his share " +
                        "of fame, pitfalls and scandal. Along the way he’s picked up a couple " +
                        "of Oscars and played a variety of memorable characters. We’ll give " +
                        "this guy a solid 4.25 out of 5 stars. Not sure we can 5 star his " +
                        "latest Batman.", actors, hashtags1);
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin was an American " +
                        "polymath and one of the Founding Fathers of the United States. " +
                        "Franklin was a leading writer, printer, political philosopher, " +
                        "politician, Freemason, postmaster, scientist, inventor, humorist, " +
                        "civic activist, statesman, and diplomat",
                "../../images/Benjamin_Franklin.jpg", "5 out of 5",
                "A figure who not only revolutionized American history but also modern " +
                        "society, Franklin was known for his many inventions such as the " +
                        "lightning rod, bifocals, and the Franklin stove. Additionally, he was " +
                        "a successful newspaper editor and printer publishing the Pennsylvania " +
                        "Gazette as well as Poor Richard's Almanac. Without Benjamin Franklin's " +
                        "contributions, our lives would be profoundly different.", historicalFigures, hashtags2);
        Ben ben3 = new Ben("Ben Kingsley", "Actor", "12/31/1943",
                "Sir Ben Kingsley (Krishna Pandit Bhanji) is an English actor with a " +
                "career spanning over 50 years. He has won an Oscar, a Grammy, a BAFTA, " +
                "two Golden Globes, and a Screen Actors Guild Award. Kingsley is best " +
                "known for his starring role as Mohandas Gandhi in the 1982 film " +
                "Gandhi, for which he won the Academy Award for Best Actor. He has " +
                "appeared in Schindler's List (1993)",
                "../../images/ben-kingsley.jfif", "5 out of 5",
                "A classy man and Sexy Beast, Ben Kingsley has been a part of many of " +
                        "our current favorite movies. He is a distinguished man of excellence " +
                        "which is why we rate this gentleman so high.", actors, hashtags2);
        Ben ben4 = new Ben("Ben Banneker", "Author", "11/9/1731",
                "Benjamin Banneker was a free African-American almanac author, " +
                        "surveyor, naturalist, and farmer. Born in Baltimore County, Maryland, " +
                        "to a free African-American woman and a former slave, Banneker had " +
                        "little formal education and was largely self-taught." +
                "surveyor, naturalist, and farmer.",
                "../../images/ben_banneker.jpg", "5 out of 5",
                "With the ability to teach himself with no next to no education is " +
                        "nothing short of remarkable. Through an extensive immersion into " +
                        "astronomy. Bannaker was able to make calculations that predicted " +
                        "eclipses and planetary conjunctions. For a man of color, let alone " +
                        "slave ancestry to acquire such ability and execute it makes him a " +
                        "highly touted Ben of legend.", historicalFigures, hashtags1, hashtags2);
        Ben ben5 = new Ben("Ben Stiller", "Actor", "11/30/1965",
                "Benjamin Edward Meara Stiller is an " +
                "American actor, comedian, film producer, film director, and " +
                "writer.His films have grossed more than $2.6 billion in Canada and " +
                "the United States, with an average of $79 million per film. " +
                "Throughout his career, he has received various awards and honors, " +
                "including an Emmy Award, multiple MTV Movie Awards, a Britannia " +
                "Award and a Teen Choice Award.",
                "https://upload.wikimedia.org/wikipedia/commons/9/9d/Ben_Stiller_May_2019.jpg", "4 out of 5",
                "This is a placeholder", actors, hashtags3);
        Ben ben6 = new Ben("Benjamin", "Spiritual Leader", "Uncertain",
                "Benjamin was the last-born of Jacob's thirteen children, and the " +
                        "second and last son of Rachel in Jewish, Christian and Islamic " +
                        "tradition. He was the progenitor of the Israelite Tribe of Benjamin. " +
                        "In the Hebrew Bible unlike Rachel's first son, Joseph, Benjamin was " +
                        "born in Canaan.", "https://upload.wikimedia.org/wikipedia/commons/d/d9/BenjaminandJoseph.jpg", "5 out of 5",
                "This is a placeholder", historicalFigures, hashtags4);
        Ben ben7 = new Ben("Benjamin Netanyahu", "Israeli Leader", "10/21/1949",
                "Benjamin \"Bibi\" Netanyahu is an Israeli " +
                        "politician who has been Prime Minister of Israel since 2009, having " +
                        "previously held the position from 1996 to 1999. Netanyahu is also " +
                        "the Chairman of the Likud-National Liberal Movement. He is the " +
                        "longest-serving Prime Minister in Israeli history, and the first to " +
                        "be born in Israel", "https://upload.wikimedia.org/wikipedia/commons/1/19/Benjamin_Netanyahu_2018.jpg",
                "3 out of 5", "This is a placeholder", historicalFigures, hashtags1);
        Ben ben8 = new Ben("Ben Simmons", "Basketball Player", "07/20/1996",
                "Ben Simmons is an Australian professional basketball player " +
                "for the Philadelphia 76ers of the National Basketball Association " +
                "(NBA). He played college basketball for one season with the " +
                "Louisiana State University (LSU) Tigers, after which he was named a " +
                "consensus first-team All-American and the USBWA National Freshman of " +
                "the Year. Simmons was selected with the first overall pick in the " +
                "2016 NBA draft by the 76ers. After sitting out a year due to an " +
                "injury", "https://upload.wikimedia.org/wikipedia/commons/f/fa/Ben_Simmons.jpg",
                "5 out of 5", "This is a placeholder", athletes, hashtags4);
        Ben ben9 = new Ben("Ben Roethlisberger", "Football Player", "03/02/1982", "Nicknamed Big Ben, He is an American football " +
                "quarterback for the Pittsburgh Steelers of the National Football " +
                "League (NFL). He played college football at Miami University, and " +
                "was drafted by the Steelers in the first round (11th overall) of the " +
                "2004 NFL Draft. Roethlisberger earned the AP NFL Offensive Rookie of " +
                "the Year Award in 2004", "https://specials-images.forbesimg.com/imageserve/1168555183/960x0.jpg", "4 out of 5",
                "This is a placeholder", athletes, hashtags2, hashtags3);
        Ben ben10 = new Ben("Ben Gordon", "Basketball Player", "04/04/1983",
                "Benjamin Ashenafi Gordon MBE is a " +
                "British-American former professional basketball player. Gordon " +
                "played for 11 seasons in the National Basketball Association (NBA), " +
                "and he played college basketball for the University of Connecticut, " +
                "where he won a national championship in 2004. He is the only " +
                "player to have ever won the NBA Sixth Man of the Year Award as a " +
                "rookie. Gordon is second in career three-point field goals for the " +
                "Chicago Bulls, behind Kirk Hinrich.",
                "https://www.gannett-cdn.com/presto/2020/02/21/USAT/346c9805-6bec-4920-9800-6ded30af7699-AP_Pistons_Gordon.JPG",
                "5 out of 5", "This is a placeholder", athletes, hashtags4);
        benRepo.save(ben1);
        benRepo.save(ben2);
        benRepo.save(ben3);
        benRepo.save(ben4);
        benRepo.save(ben5);
        benRepo.save(ben6);
        benRepo.save(ben7);
        benRepo.save(ben8);
        benRepo.save(ben9);
        benRepo.save(ben10);

    }
}
