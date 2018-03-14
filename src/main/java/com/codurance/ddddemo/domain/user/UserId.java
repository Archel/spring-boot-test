package com.codurance.ddddemo.domain.user;

import lombok.Value;

@Value(staticConstructor="of")
public class UserId {
    private final String userId;
}
