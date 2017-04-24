package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by parke on 2017-04-24.
 */
@Entity
public class Account {

    @OneToMany(mappedBy = "account")
    @Getter
    @Setter
    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    @GeneratedValue
    @Getter
    private Long id;

//    public Set<Bookmark> getBookmarks() {
//        return bookmarks;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUsername() {
//        return username;
//    }

    @Getter
    @JsonIgnore
    public String password;
    @Getter
    public String username;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }


    Account() { // jpa only
    }
}