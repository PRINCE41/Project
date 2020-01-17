package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.StudentInitials;

public interface StudentInitialsService {
	
	StudentInitials saveDetails(StudentInitials studentInitials);
	StudentInitials updateDetails(StudentInitials studentInitials);
	void deleteDetails(StudentInitials studentInitials);
	StudentInitials getDetailsByPrn(long uId);
	List<StudentInitials> getAllDetails();

}
