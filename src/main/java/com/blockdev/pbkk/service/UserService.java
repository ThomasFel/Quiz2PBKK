package com.blockdev.pbkk.service;

import com.blockdev.pbkk.controller.dto.UserRegistrationDto;
import com.blockdev.pbkk.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}