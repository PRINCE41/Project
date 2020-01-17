package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.AdminRegistrationRepo;
import com.prince.cdac.model.AdminRegistration;

@Service
public class AdminRegistrationServiceImpl implements AdminRegistrationService {

	@Autowired
	private AdminRegistrationRepo adminRegistrationRepo;
	
	
	
	public AdminRegistrationRepo getAdminRegistrationRepo() {
		return adminRegistrationRepo;
	}

	public void setAdminRegistrationRepo(AdminRegistrationRepo adminRegistrationRepo) {
		this.adminRegistrationRepo = adminRegistrationRepo;
	}
	
	

	@Override
	public AdminRegistration saveDetails(AdminRegistration adminRegistration) {
		return adminRegistrationRepo.save(adminRegistration);
	}

	@Override
	public AdminRegistration updateDetails(AdminRegistration adminRegistration) {
		return adminRegistrationRepo.save(adminRegistration);
	}

	@Override
	public void deleteDetails(AdminRegistration adminRegistration) {
		adminRegistrationRepo.delete(adminRegistration);
	}

	@Override
	public AdminRegistration getDetailsByPrn(long uId) {
		return adminRegistrationRepo.getOne(uId);
	}

	@Override
	public List<AdminRegistration> getAllDetails() {
		return adminRegistrationRepo.findAll();
	}

}
