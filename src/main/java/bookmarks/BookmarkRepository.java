package bookmarks;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by parke on 2017-04-24.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}