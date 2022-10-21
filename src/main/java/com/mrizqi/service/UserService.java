package com.mrizqi.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.mrizqi.model.User;
import com.mrizqi.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
