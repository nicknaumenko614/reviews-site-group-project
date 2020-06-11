package org.wecancodeit.reviews;

import java.util.Collection;

public class Category {

private String categoryName;
private Collection<Ben> bens;

    public Category(String categoryName, Collection<Ben> bens) {
        this.categoryName = categoryName;
        this.bens = bens;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Collection<Ben> getBens() {
        return bens;
    }
}

