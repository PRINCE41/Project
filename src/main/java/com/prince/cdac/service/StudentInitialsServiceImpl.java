package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prince.cdac.dao.StudentInitialsRepo;
import com.prince.cdac.model.StudentInitials;

public class StudentInitialsServiceImpl implements StudentInitialsService {

	@Autowired
	private StudentInitialsRepo studentInitialsRepo;
	
	
	

	public StudentInitialsRepo getStudentInitialsRepo() {
		return studentInitialsRepo;
	}

	public void setStudentInitialsRepo(StudentInitialsRepo studentInitialsRepo) {
		this.studentInitialsRepo = studentInitialsRepo;
	}

	@Override
	public StudentInitials saveDetails(StudentInitials studentInitials) {

		return studentInitialsRepo.save(studentInitials);
	}

	@Override
	public StudentInitials updateDetails(StudentInitials studentInitials) {
		return studentInitialsRepo.save(studentInitials);
	}

	@Override
	public void deleteDetails(StudentInitials studentInitials) {
		studentInitialsRepo.delete(studentInitials);
	}

	@Override
	public StudentInitials getDetailsByPrn(long uId) {
		return studentInitialsRepo.getOne(uId);
	}

	@Override
	public List<StudentInitials> getAllDetails() {
		return studentInitialsRepo.findAll();
	}

}
