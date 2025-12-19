package com.authi.entities.users.dtos;

import com.authi.entities.users.UserRole;

public record RegisterDTO(String name, String email, String password, UserRole role) {
}
