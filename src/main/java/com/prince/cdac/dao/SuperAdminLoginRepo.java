package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.SuperAdminLogin;

public interface SuperAdminLoginRepo extends JpaRepository<SuperAdminLogin, Long> {

}
