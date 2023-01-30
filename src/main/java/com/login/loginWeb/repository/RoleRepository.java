package com.login.loginWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.loginWeb.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
