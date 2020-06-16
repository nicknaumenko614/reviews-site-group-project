package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
@Id
@GeneratedValue
private long id;

    private String categoryName;

@OneToMany (mappedBy = "category")
private Collection<Ben> bens;

protected Category(){}

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.bens = bens;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Collection<Ben> getBens() {
        return bens;
    }

    public long getId() {
        return id;
    }
}
