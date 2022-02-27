package com.nura.textiles.service;

import com.nura.textiles.entity.user.User;

public interface UserService {

	public User saveUser(User user);

	public User findUserByLoginId(String loginId);

}
