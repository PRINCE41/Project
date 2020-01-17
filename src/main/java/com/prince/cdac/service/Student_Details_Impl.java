package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.StudentRepo;
import com.prince.cdac.model.SDetailsSaved;

@Service
public class Student_Details_Impl implements Student_Details {

	@Autowired
	private StudentRepo studentRepo;
	
	
	
	public StudentRepo getStudentRepo() {
		return studentRepo;
	}

	public void setStudentRepo(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public SDetailsSaved saveDetails(SDetailsSaved sDetailsSaved) {
		return studentRepo.save(sDetailsSaved);
	}

	@Override
	public SDetailsSaved updateDetails(SDetailsSaved sDetailsSaved) {
		return studentRepo.save(sDetailsSaved);
	}

	@Override
	public void deleteDetails(SDetailsSaved sDetailsSaved) {
		studentRepo.delete(sDetailsSaved);
	}

	@Override
	public SDetailsSaved getDetailsByPrn(long uId) {
		return studentRepo.getOne(uId);
	}

	@Override
	public List<SDetailsSaved> getAllDetails() {
		return studentRepo.findAll();
	}

}
