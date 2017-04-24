package bookmarks;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by parke on 2017-04-24.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
