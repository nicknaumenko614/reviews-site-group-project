package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private String authorName;
    @ManyToOne
    private Ben ben;

    protected Comment() {
    }

    public Comment(String text, Ben ben, String authorName) {
        this.text = text;
        this.ben = ben;
        this.authorName = authorName;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Ben getBen() {
        return ben;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id &&
                Objects.equals(text, comment.text) &&
                Objects.equals(authorName, comment.authorName) &&
                Objects.equals(ben, comment.ben);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, authorName, ben);
    }
}