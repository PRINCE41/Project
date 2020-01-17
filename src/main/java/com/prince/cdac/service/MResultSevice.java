package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.MResult;

public interface MResultSevice {
	
	MResult saveDetails(MResult mResult);
	MResult updateDetails(MResult mResult);
	void deleteDetails(MResult mResult);
	MResult getDetailsByPrn(long uId);
	List<MResult> getAllDetails();

}
