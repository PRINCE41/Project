package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.PersonalDetailsRepo;
import com.prince.cdac.model.PersonalDetails;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService {

	@Autowired
	private PersonalDetailsRepo personalDetailsRepo;
	
	
	
	public PersonalDetailsRepo getPersonalDetailsRepo() {
		return personalDetailsRepo;
	}

	public void setPersonalDetailsRepo(PersonalDetailsRepo personalDetailsRepo) {
		this.personalDetailsRepo = personalDetailsRepo;
	}
	

	@Override
	public PersonalDetails saveUser(PersonalDetails personalDetails) {
		return personalDetailsRepo.save(personalDetails);
	}

	@Override
	public PersonalDetails updateUser(PersonalDetails personalDetails) {
		
		return personalDetailsRepo.save(personalDetails);
	}

	@Override
	public void delUser(PersonalDetails personalDetails) {
		personalDetailsRepo.delete(personalDetails);
	}

	@Override
	public PersonalDetails getUserById(long uId) {
		return personalDetailsRepo.getOne(uId);
	}

	@Override
	public List<PersonalDetails> getAllDetails() {
		return personalDetailsRepo.findAll();
	}

}
