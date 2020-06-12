package org.wecancodeit.reviews;

public class Ben {

    private String name;
    private String profession;
    private String birthDate;
    private String bio;
    private String hashtag;
    private String imageName;
    private String reviewScore;
    private String reviewText;

    public Ben(String name, String profession, String birthDate, String bio, String hashtag, String imageName, String reviewScore, String reviewText) {
        this.name = name;
        this.profession = profession;
        this.birthDate = birthDate;
        this.bio = bio;
        this.hashtag = hashtag;
        this.imageName = imageName;
        this.reviewScore = reviewScore;
        this.reviewText = reviewText;
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

    public String getHashtag() {
        return hashtag;
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
}

