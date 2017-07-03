package com.jpa.lwk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.lwk.dao.UserRepository;
import com.jpa.lwk.entity.MyUser;
import com.jpa.lwk.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<MyUser> getAllUser() {
		
		return userRepository.findAll();
	}

}
