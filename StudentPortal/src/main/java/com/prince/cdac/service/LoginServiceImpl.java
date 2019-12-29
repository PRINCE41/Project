package com.prince.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.LoginRepo;
import com.prince.cdac.model.Login;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo loginRepo;
	
	public LoginRepo getLoginRepo() {
		return loginRepo;
	}

	public void setLoginRepo(LoginRepo loginRepo) {
		this.loginRepo = loginRepo;
	}
	
	@Override
	public Login saveUser(Login login) {
		return loginRepo.save(login);
	}

	@Override
	public Login updateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delUser(Login login) {
		// TODO Auto-generated method stub

	}

	@Override
	public Login getUserById(long uId) {
		return loginRepo.getOne(uId);
	}

}
