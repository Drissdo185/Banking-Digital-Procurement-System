package com.example.identity_service.controller;

import com.example.identity_service.dto.request.ApiResponse;
import com.example.identity_service.dto.request.UserCreation;
import com.example.identity_service.dto.response.UserResponse;
import com.example.identity_service.service.UserSerivice;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    UserSerivice userSerivice;

    @PostMapping("/createUser")
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreation request){
        return ApiResponse.<UserResponse>builder()
                .result(userSerivice.createUser(request)).build();
    }
}
