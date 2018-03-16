package com.codurance.ddddemo.domain.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private final UserId id;
    private final String name;
    private final String surname;

    public User(UserId id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
