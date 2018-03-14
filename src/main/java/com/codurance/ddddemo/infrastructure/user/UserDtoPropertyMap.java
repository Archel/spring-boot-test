package com.codurance.ddddemo.infrastructure.user;

import com.codurance.ddddemo.user.User;
import org.modelmapper.PropertyMap;

public class UserDtoPropertyMap extends PropertyMap<User, UserDto> {

    @Override
    protected void configure() {
        skip().setUserId(null);
    }
}
