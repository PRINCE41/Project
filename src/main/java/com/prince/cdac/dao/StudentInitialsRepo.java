package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.StudentInitials;

public interface StudentInitialsRepo extends JpaRepository<StudentInitials, Long> {

}
