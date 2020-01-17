package com.prince.cdac.service;

import java.util.List;

import com.prince.cdac.model.Hostel;

public interface HostelService {
	
	Hostel saveDetails(Hostel hostel);
	Hostel updateDetails(Hostel hostel);
	void deleteDetails(Hostel hostel);
	Hostel getDetailsByPrn(long uId);
	List<Hostel> getAllDetails();

}
