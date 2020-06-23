package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;

    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Collection<Ben> bens;

    protected Category() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
                Objects.equals(categoryName, category.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName);
    }
}
