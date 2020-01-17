package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.IdCardRepo;
import com.prince.cdac.model.IdCard;

@Service
public class IdCardServiceImpl implements IdCardService {

	@Autowired
	IdCardRepo idCardRepo;
	
	
	
	public IdCardRepo getIdCardRepo() {
		return idCardRepo;
	}

	public void setIdCardRepo(IdCardRepo idCardRepo) {
		this.idCardRepo = idCardRepo;
	}

	@Override
	public IdCard saveDetails(IdCard idCard) {
		return idCardRepo.save(idCard);
	}

	@Override
	public IdCard updateDetails(IdCard idCard) {
		return idCardRepo.save(idCard);
	}

	@Override
	public void deleteDetails(IdCard idCard) {
		idCardRepo.delete(idCard);

	}

	@Override
	public IdCard getDetailsByPrn(long uId) {
		return idCardRepo.getOne(uId);
	}

	@Override
	public List<IdCard> getAllDetails() {
		return idCardRepo.findAll();
	}

}
