package com.nura.textiles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nura.textiles.configuration.GlobalConfiguration;
import com.nura.textiles.entity.user.User;
import com.nura.textiles.repository.UserRepository;
import com.nura.textiles.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private GlobalConfiguration globalConfig;

	@Override
	public User saveUser(User user) {
		user.setPassword(encryptUserPassword(user.getPassword()));
		return userRepo.save(user);
	}

	@Override
	public User findUserByLoginId(String loginId) {
		return null;
	}

	private String encryptUserPassword(String password) {
		return globalConfig.encoder().encode(password);
	}

}
