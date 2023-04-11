package com.deployment.deployment.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserRequestDto {

    private final String userId;
    private final String userPassword;

}
