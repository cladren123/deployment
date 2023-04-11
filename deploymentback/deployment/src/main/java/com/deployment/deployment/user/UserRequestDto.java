package com.deployment.deployment.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class UserRequestDto {

    private final String id;
    private final String password;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
