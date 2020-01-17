package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prince.cdac.dao.GResultRepo;
import com.prince.cdac.model.GResult;

public class GResultServiceImpl implements GResultService {

	@Autowired
	GResultRepo gResultRepo;
	
	
	
	public GResultRepo getgResultRepo() {
		return gResultRepo;
	}

	public void setgResultRepo(GResultRepo gResultRepo) {
		this.gResultRepo = gResultRepo;
	}

	@Override
	public GResult saveDetails(GResult gResult) {
		return gResultRepo.save(gResult);
	}

	@Override
	public GResult updateDetails(GResult gResult) {
		return gResultRepo.save(gResult);
	}

	@Override
	public void deleteDetails(GResult gResult) {
		gResultRepo.delete(gResult);

	}

	@Override
	public GResult getDetailsByPrn(long uId) {
		return gResultRepo.getOne(uId);
	}

	@Override
	public List<GResult> getAllDetails() {
		return gResultRepo.findAll();
	}

}
