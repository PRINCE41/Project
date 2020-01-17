/**
 * 
 */
package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.MResultRepo;
import com.prince.cdac.model.MResult;

@Service
public class MResultSeviceImpl implements MResultSevice {

	@Autowired
	MResultRepo mResultRepo;
	
	@Override
	public MResult saveDetails(MResult mResult) {
		return mResultRepo.save(mResult);
	}

	@Override
	public MResult updateDetails(MResult mResult) {
		return mResultRepo.save(mResult);
	}

	@Override
	public void deleteDetails(MResult mResult) {
		mResultRepo.delete(mResult);

	}

	@Override
	public MResult getDetailsByPrn(long uId) {
		return mResultRepo.getOne(uId);
	}

	@Override
	public List<MResult> getAllDetails() {
		return mResultRepo.findAll();
	}

}
