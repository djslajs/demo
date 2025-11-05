package com.example.demo.domain.member.controller;

import com.example.demo.common.ApiResponse;
import com.example.demo.domain.member.dto.UserRequest;
import com.example.demo.domain.member.dto.UserResponse;
import com.example.demo.domain.member.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<UserResponse> createUser(@RequestBody UserRequest request) {
        return ApiResponse.success(userService.create( request));
    }
}
