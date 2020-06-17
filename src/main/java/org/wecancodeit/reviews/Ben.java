package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Ben {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String profession;
    private String birthDate;
    private String bio;
    private String imageName;
    private String reviewScore;
    private String reviewText;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Ben(){}

    public Ben(String name, String profession, String birthDate, String bio, String imageName, String reviewScore, String reviewText, Category category, Hashtags... hashtags) {
        this.name = name;
        this.profession = profession;
        this.birthDate = birthDate;
        this.bio = bio;
        this.imageName = imageName;
        this.reviewScore = reviewScore;
        this.reviewText = reviewText;
        this.category = category;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }


    public String getBirthDate() {
        return birthDate;
    }

    public String getBio() {
        return bio;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }

    public String getImageName() {
        return imageName;
    }

    public String getReviewScore() {
        return reviewScore;
    }

    public String getReviewText() {
        return reviewText;
    }

    public Category getCategory() {
        return category;
    }

    public long getId() {
        return id;
    }
}

