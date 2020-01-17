package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.AttendanceRepo;
import com.prince.cdac.model.Attendance;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceRepo attendanceRepo;
	
	
	
	public AttendanceRepo getAttendanceRepo() {
		return attendanceRepo;
	}

	public void setAttendanceRepo(AttendanceRepo attendanceRepo) {
		this.attendanceRepo = attendanceRepo;
	}

	@Override
	public Attendance saveDetails(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}

	@Override
	public Attendance updateDetails(Attendance attendance) {
		return attendanceRepo.save(attendance);
	}

	@Override
	public void deleteDetails(Attendance attendance) {
		attendanceRepo.delete(attendance);

	}

	@Override
	public Attendance getDetailsByPrn(long uId) {
		return attendanceRepo.getOne(uId);
	}

	@Override
	public List<Attendance> getAllDetails() {
		return attendanceRepo.findAll();
	}

}
