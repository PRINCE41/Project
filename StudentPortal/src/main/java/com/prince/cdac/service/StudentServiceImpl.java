package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.RegistrationRepo;
import com.prince.cdac.model.RegistrationDetails;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private RegistrationRepo registrationRepo;
	

	public RegistrationRepo getRegistrationRepo() {
		return registrationRepo;
	}

	public void setRegistrationRepo(RegistrationRepo registrationRepo) {
		this.registrationRepo = registrationRepo;
	}

	@Override
	public RegistrationDetails saveStuDet(RegistrationDetails registrationDetails) {
		return registrationRepo.save(registrationDetails);
	}

	@Override
	public RegistrationDetails updateStuDet(RegistrationDetails registrationDetails) {
		return registrationRepo.save(registrationDetails);
	}

	@Override
	public void deleteStuDet(RegistrationDetails registrationDetails) {
		registrationRepo.delete(registrationDetails);
	}

	@Override
	public RegistrationDetails getStuById(long ccat_form_number) {
		return registrationRepo.getOne(ccat_form_number);
	}

	@Override
	public List<RegistrationDetails> getAllStudents() {
		return registrationRepo.findAll();
	}

}
