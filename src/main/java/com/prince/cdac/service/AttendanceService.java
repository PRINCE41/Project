package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.Attendance;

public interface AttendanceService {

	Attendance saveDetails(Attendance attendance);
	Attendance updateDetails(Attendance attendance);
	void deleteDetails(Attendance attendance);
	Attendance getDetailsByPrn(long uId);
	List<Attendance> getAllDetails();
	
}
