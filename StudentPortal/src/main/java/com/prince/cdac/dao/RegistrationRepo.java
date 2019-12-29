package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.prince.cdac.model.RegistrationDetails;

public interface RegistrationRepo extends JpaRepository<RegistrationDetails, Long> {

}
