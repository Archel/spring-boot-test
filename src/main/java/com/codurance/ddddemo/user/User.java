package com.codurance.ddddemo.user;

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
