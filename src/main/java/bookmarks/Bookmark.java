package bookmarks;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by parke on 2017-04-24.
 */
@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    @Getter
    private Account account;

    @Id
    @GeneratedValue
    @Getter
    private Long id;

    Bookmark() { // jpa only
    }

    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }

    @Getter
    public String uri;
    @Getter
    public String description;

//    public Account getAccount() {
//        return account;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getUri() {
//        return uri;
//    }
//
//    public String getDescription() {
//        return description;
//    }
}