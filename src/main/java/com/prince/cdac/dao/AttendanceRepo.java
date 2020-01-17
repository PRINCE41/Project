package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

}
