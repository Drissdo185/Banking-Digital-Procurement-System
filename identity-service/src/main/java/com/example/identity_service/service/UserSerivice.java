package com.example.identity_service.service;

import com.example.identity_service.dto.request.UserCreation;
import com.example.identity_service.dto.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserSerivice {
    UserResponse createUser(UserCreation request);
    void deleteUser(Long userId);



}
