package com.codurance.ddddemo.domain.user;

import java.util.Optional;

public interface UserRepository {
    Optional<User> ofId(UserId userId);
}
