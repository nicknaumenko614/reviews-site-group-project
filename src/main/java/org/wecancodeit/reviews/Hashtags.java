package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtags hashtags = (Hashtags) o;
        return id == hashtags.id &&
                Objects.equals(hashtag, hashtags.hashtag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hashtag);
    }
}
