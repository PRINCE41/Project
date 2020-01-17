package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.IdCard;

public interface IdCardService {
	
	IdCard saveDetails(IdCard idCard);
	IdCard updateDetails(IdCard idCard);
	void deleteDetails(IdCard idCard);
	IdCard getDetailsByPrn(long uId);
	List<IdCard> getAllDetails();

}
