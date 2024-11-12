package com.example.identity_service.service.impl;

import com.example.identity_service.dto.request.UserCreation;
import com.example.identity_service.dto.response.UserResponse;
import com.example.identity_service.entity.User;
import com.example.identity_service.mapper.UserMapper;
import com.example.identity_service.repository.UserRepository;
import com.example.identity_service.service.UserSerivice;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.expression.ExpressionException;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserSeriviceImpl implements UserSerivice {

   UserRepository userRepository;
   UserMapper userMapper;

   public UserResponse createUser(UserCreation request){
       User user = userMapper.toEntity(request);
       return userMapper.toDto(user);
   }

   public void deleteUser(Long id){
       User user = userRepository.findById(id)
               .orElseThrow(() -> new ExpressionException("User not found with id: " + id));
       userRepository.delete(user);

   }


}
