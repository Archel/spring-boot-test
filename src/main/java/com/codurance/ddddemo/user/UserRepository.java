package com.codurance.ddddemo.user;

public interface UserRepository {
    User ofId(UserId userId);
}
