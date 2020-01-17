package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.RegistrationDetails;

public interface StudentService {
	
	RegistrationDetails saveStuDet(RegistrationDetails registrationDetails);
	RegistrationDetails updateStuDet(RegistrationDetails registrationDetails);
	void deleteStuDet(RegistrationDetails registrationDetails);
	RegistrationDetails getStuById(long uId);
	List<RegistrationDetails> getAllStudents();

}
