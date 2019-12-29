package com.prince.cdac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prince.cdac.model.SDetailsSaved;

public interface Student_Details {
	
	SDetailsSaved saveDetails(SDetailsSaved sDetailsSaved);
	SDetailsSaved updateDetails(SDetailsSaved sDetailsSaved);
	void deleteDetails(SDetailsSaved sDetailsSaved);
	SDetailsSaved getDetailsByPrn(long prnNo);
	List<SDetailsSaved> getAllDetails();
}
