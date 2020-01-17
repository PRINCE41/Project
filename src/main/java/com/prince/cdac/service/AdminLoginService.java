package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.AdminLogin;

public interface AdminLoginService {
	
	AdminLogin saveDetails(AdminLogin adminLogin);
	AdminLogin updateDetails(AdminLogin adminLogin);
	void deleteDetails(AdminLogin adminLogin);
	AdminLogin getDetailsByUId(long uId);
	List<AdminLogin> getAllDetails();

}
