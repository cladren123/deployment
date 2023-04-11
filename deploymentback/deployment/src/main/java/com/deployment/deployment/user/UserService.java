package com.deployment.deployment.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;



    public UserResponseDto findByUserId(UserRequestDto userRequestDto) {
        UserEntity userEntity = userRepository.findByUserId(userRequestDto.getUserId()).orElseThrow();
        String result = "FAIL";
        if (userEntity.getUserPassword().equals(userRequestDto.getUserPassword())) {
            result = "SUCCESS";
        }

        return UserResponseDto.builder()
                .responseMessage(result)
                .build();
    }

}
