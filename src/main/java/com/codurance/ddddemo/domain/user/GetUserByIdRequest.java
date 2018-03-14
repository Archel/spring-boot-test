package com.codurance.ddddemo.domain.user;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class GetUserByIdRequest {
    private String userId;
}
