package com.codurance.ddddemo.infrastructure.user;

import com.codurance.ddddemo.user.User;
import com.codurance.ddddemo.user.UserId;
import com.codurance.ddddemo.user.UserRepository;

public class InMemoryUserRepository implements UserRepository {

    private User user;

    public InMemoryUserRepository() {
        user = new User(UserId.of("1921ef2c-d023-4a39-b01e-bba58b3e051b"), "Manolo", "Villuela");
    }

    @Override
    public User ofId(UserId userId) {
        if (userId.getUserId().equals("1921ef2c-d023-4a39-b01e-bba58b3e051b")) {
            return user;
        }

        return null;
    }
}
