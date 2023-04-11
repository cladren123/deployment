package com.deployment.deployment.user;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public UserResponseDto login(@RequestBody UserRequestDto userRequestDto) {
        return userService.findByUserId(userRequestDto);
    }

}
