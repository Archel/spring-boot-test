package com.codurance.ddddemo.user;

public class GetUserById {
    private UserRepository userRepository;

    public GetUserById(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User get(GetUserByIdRequest getUserByIdRequest) {
        User user = userRepository.ofId(UserId.of(getUserByIdRequest.getUserId()));

        return user;
    }
}
