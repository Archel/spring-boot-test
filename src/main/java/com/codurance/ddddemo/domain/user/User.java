package com.codurance.ddddemo.domain.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private final UserId userId;
    private final String name;
    private final String surname;

    public User(UserId userId, String name, String surname) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }
}
