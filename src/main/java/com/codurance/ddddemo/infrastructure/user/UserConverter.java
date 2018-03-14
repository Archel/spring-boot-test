package com.codurance.ddddemo.infrastructure.user;

import com.codurance.ddddemo.user.User;
import org.modelmapper.ModelMapper;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter<User, UserDto> {

    private final ModelMapper modelMapper;

    public UserConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto convert(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        userDto.setUserId(user.getUserId().getUserId());

        return userDto;
    }
}
