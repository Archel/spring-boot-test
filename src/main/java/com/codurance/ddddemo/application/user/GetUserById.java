package com.codurance.ddddemo.application.user;

import com.codurance.ddddemo.domain.user.*;

import java.util.Optional;

public class GetUserById {
    private UserRepository userRepository;

    public GetUserById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(GetUserByIdRequest getUserByIdRequest) {
        Optional<User> user = userRepository.ofId(UserId.of(getUserByIdRequest.getUserId()));

        return user.orElseThrow(UserNotFoundException::new);
    }
}
