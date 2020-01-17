package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.GResult;

public interface GResultService {
	
	GResult saveDetails(GResult gResult);
	GResult updateDetails(GResult gResult);
	void deleteDetails(GResult gResult);
	GResult getDetailsByPrn(long uId);
	List<GResult> getAllDetails();

}
