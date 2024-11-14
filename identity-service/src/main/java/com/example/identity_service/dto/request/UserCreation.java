package com.example.identity_service.dto.request;

import com.example.identity_service.entity.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Value
public class UserCreation implements Serializable {
    @NotNull
    @Size(max = 50)
    String username;
    @NotNull
    @Size(max = 100)
    String email;
    @NotNull
    @Size(max = 255)
    String password;
    @Size(max = 50)
    String firstName;
    @Size(max = 50)
    String lastName;
}