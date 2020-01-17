package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.AdminRegistration;

public interface AdminRegistrationService {
	
	AdminRegistration saveDetails(AdminRegistration adminRegistration);
	AdminRegistration updateDetails(AdminRegistration adminRegistration);
	void deleteDetails(AdminRegistration adminRegistration);
	AdminRegistration getDetailsByPrn(long uId);
	List<AdminRegistration> getAllDetails();

}
