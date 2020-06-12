package org.wecancodeit.reviews;

import java.util.Collection;

public class Hashtags {

    private String hashtag;
    private Collection<Ben> bens;

    public Hashtags(String hashtag, Collection<Ben> bens) {
        this.hashtag = hashtag;
        this.bens = bens;
    }

    public String getHashtag() {
        return hashtag;
    }

    public Collection<Ben> getBens() {
        return bens;
    }
}
