package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.AdminRegistration;

public interface AdminRegistrationRepo extends JpaRepository<AdminRegistration, Long> {

}
