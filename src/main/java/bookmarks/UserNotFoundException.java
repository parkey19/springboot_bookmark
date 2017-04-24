package bookmarks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by parke on 2017-04-24.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException  {
    public UserNotFoundException(String userId) {
        super("could not find user '" + userId + "'.");
    }
}

