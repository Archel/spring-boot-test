package com.codurance.ddddemo.domain.user;

public interface UserRepository {
    User ofId(UserId userId);
}
