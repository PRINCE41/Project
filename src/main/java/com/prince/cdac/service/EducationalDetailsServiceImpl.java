package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.EducationalDetailsRepo;
import com.prince.cdac.model.EducationalDetails;

@Service
public class EducationalDetailsServiceImpl implements EducationalDetailsService {

	@Autowired
	private EducationalDetailsRepo educationalDetailsRepo;
	
	
	
	public EducationalDetailsRepo getEducationalDetailsRepo() {
		return educationalDetailsRepo;
	}

	public void setEducationalDetailsRepo(EducationalDetailsRepo educationalDetailsRepo) {
		this.educationalDetailsRepo = educationalDetailsRepo;
	}

	@Override
	public EducationalDetails saveUser(EducationalDetails educationalDetails) {
		return educationalDetailsRepo.save(educationalDetails);
	}

	@Override
	public EducationalDetails updateUser(EducationalDetails educationalDetails) {
		return educationalDetailsRepo.save(educationalDetails);
	}

	@Override
	public void delUser(EducationalDetails educationalDetails) {
		educationalDetailsRepo.delete(educationalDetails);

	}

	@Override
	public EducationalDetails getUserById(long uId) {
		return educationalDetailsRepo.getOne(uId);
	}

	@Override
	public List<EducationalDetails> getAllDetails() {
		return educationalDetailsRepo.findAll();
	}

}
