package org.wecancodeit.reviews;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private String authorName;
    @ManyToOne
    private Ben ben;
    protected Comment() {}
    public Comment (String text, Ben ben, String authorName) {
        this.text=text;
        this.ben=ben;
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
}