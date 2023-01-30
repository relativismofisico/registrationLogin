package com.login.loginWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.loginWeb.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
