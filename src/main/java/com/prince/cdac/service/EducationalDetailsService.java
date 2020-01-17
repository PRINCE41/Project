package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.EducationalDetails;

public interface EducationalDetailsService {
	
	EducationalDetails saveUser(EducationalDetails educationalDetails);
	EducationalDetails updateUser(EducationalDetails educationalDetails);
	void delUser(EducationalDetails educationalDetails);
	EducationalDetails getUserById(long uId);
	List<EducationalDetails> getAllDetails();

}
