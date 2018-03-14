package com.codurance.ddddemo.infrastructure.user;

import lombok.Data;


@Data
public class UserDto {
    private String userId;
    private String name;
    private String surname;
}
