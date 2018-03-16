package com.codurance.ddddemo.infrastructure;

import lombok.Data;

@Data
public class ErrorMessageDto {
    private String errorId;
    private String message;

    public ErrorMessageDto(String errorId, String message) {
        this.errorId = errorId;
        this.message = message;
    }
}
