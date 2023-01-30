package com.login.loginWeb.service;

import com.login.loginWeb.entity.User;

public interface UserService {
	void save(User user);
	User findByUserName(String userName);
}
