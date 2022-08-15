package com.example.repository.service;

import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.entity.User;

public interface UserService {

	User save(User registerUser);
}
