package com.codurance.ddddemo.controller;

import com.codurance.ddddemo.domain.user.UserNotFoundException;
import com.codurance.ddddemo.infrastructure.ErrorMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdvisorController {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessageDto handleNotFoundException(UserNotFoundException userNotFoundException) {
        return new ErrorMessageDto("111-111-ad12", userNotFoundException.getMessage());
    }
}
