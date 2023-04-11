package com.deployment.deployment.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;



public interface UserService {

    public String login(UserRequestDto userRequestDto) throws Throwable;





}
