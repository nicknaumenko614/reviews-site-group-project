package org.wecancodeit.reviews;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Ben {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String profession;
    private String birthDate;
    @Column(length = 512)
    private String bio;
    private String imageURL;
    private String reviewScore;
    @Column(length = 512)
    private String reviewText;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Ben() {
    }

    public Ben(String name, String profession, String birthDate, String bio, String imageURL,
               String reviewScore, String reviewText, Category category, Hashtags... hashtags) {
        this.name = name;
        this.profession = profession;
        this.birthDate = birthDate;
        this.bio = bio;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
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

    public void addHashtags(Hashtags hashtag) {
        hashtags.add(hashtag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ben ben = (Ben) o;
        return id == ben.id &&
                Objects.equals(name, ben.name) &&
                Objects.equals(profession, ben.profession) &&
                Objects.equals(birthDate, ben.birthDate) &&
                Objects.equals(bio, ben.bio) &&
                Objects.equals(imageURL, ben.imageURL) &&
                Objects.equals(reviewScore, ben.reviewScore) &&
                Objects.equals(reviewText, ben.reviewText) &&
                Objects.equals(category, ben.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profession, birthDate, bio, imageURL, reviewScore, reviewText, category);
    }
}

