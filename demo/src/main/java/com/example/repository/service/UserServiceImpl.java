package com.example.repository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	
	
	private UserRepository userRepo;
	
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User save(User registerUser) {
		// TODO Auto-generated method stub
		User user = new User(registerUser.getFirstname(),registerUser.getLastname(),registerUser.getEmail(),registerUser.getPassword());
	
		return userRepo.save(user);
	}
	
	
	

}
