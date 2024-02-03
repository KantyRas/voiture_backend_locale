package com.example.springsecurity.dto;

import com.example.springsecurity.user.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDTO {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String role;
}
