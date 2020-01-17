package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.AdminLogin;

public interface AdminLoginRepo extends JpaRepository<AdminLogin, Long> {

}
