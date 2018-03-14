package com.codurance.ddddemo.application.user;

import com.codurance.ddddemo.domain.user.*;
import com.codurance.ddddemo.user.*;

public class GetUserById {
    private UserRepository userRepository;

    public GetUserById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(GetUserByIdRequest getUserByIdRequest) throws UserNotFoundException {
        User user = userRepository.ofId(UserId.of(getUserByIdRequest.getUserId()));

        if (user == null) {
            throw new UserNotFoundException();
        }

        return user;
    }
}
