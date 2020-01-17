package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.AdminLoginRepo;
import com.prince.cdac.model.AdminLogin;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	AdminLoginRepo adminLoginRepo;
	

	public AdminLoginRepo getAdminLoginRepo() {
		return adminLoginRepo;
	}

	public void setAdminLoginRepo(AdminLoginRepo adminLoginRepo) {
		this.adminLoginRepo = adminLoginRepo;
	}

	@Override
	public AdminLogin saveDetails(AdminLogin adminLogin) {
		return adminLoginRepo.save(adminLogin);
	}

	@Override
	public AdminLogin updateDetails(AdminLogin adminLogin) {
		return adminLoginRepo.save(adminLogin);
	}

	@Override
	public void deleteDetails(AdminLogin adminLogin) {
		adminLoginRepo.delete(adminLogin);

	}

	

	@Override
	public List<AdminLogin> getAllDetails() {
		return adminLoginRepo.findAll();
	}

	@Override
	public AdminLogin getDetailsByUId(long uId) {
		return adminLoginRepo.getOne(uId);
	}

}
