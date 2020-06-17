package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtags {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;
    @ManyToMany (mappedBy = "hashtags")
    private Collection<Ben> bens;

    protected Hashtags(){}

    public Hashtags(String hashtag) {
        this.hashtag = hashtag;
            }

    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }

    public Collection<Ben> getBens() {
        return bens;
    }
}
