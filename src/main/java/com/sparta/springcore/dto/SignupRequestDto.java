package com.sparta.springcore.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}