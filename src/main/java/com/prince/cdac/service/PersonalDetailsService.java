package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.PersonalDetails;

public interface PersonalDetailsService {
	
	PersonalDetails saveUser(PersonalDetails personalDetails);
	PersonalDetails updateUser(PersonalDetails personalDetails);
	void delUser(PersonalDetails personalDetails);
	PersonalDetails getUserById(long uId);
	List<PersonalDetails> getAllDetails();
}
