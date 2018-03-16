package com.codurance.ddddemo.domain.user;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(GetUserByIdRequest getUserByIdRequest) {
        super("User not found with id: " + getUserByIdRequest.getUserId());
    }
}
