package com.codurance.ddddemo.infrastructure.user;

import com.codurance.ddddemo.domain.user.User;
import com.codurance.ddddemo.domain.user.UserId;
import com.codurance.ddddemo.domain.user.UserRepository;

import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {

    private User user;

    public InMemoryUserRepository() {
        user = new User(UserId.of("1921ef2c-d023-4a39-b01e-bba58b3e051b"), "Manolo", "Villuela");
    }

    @Override
    public Optional<User> ofId(UserId userId) {
        if (userId.getValue().equals("1921ef2c-d023-4a39-b01e-bba58b3e051b")) {
            return Optional.of(user);
        }

        return Optional.empty();
    }
}
