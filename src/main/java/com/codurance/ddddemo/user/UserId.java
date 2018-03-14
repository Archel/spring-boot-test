package com.codurance.ddddemo.user;

import lombok.Value;

@Value(staticConstructor="of")
public class UserId {
    private final String userId;
}
