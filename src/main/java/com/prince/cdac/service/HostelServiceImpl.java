package com.prince.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.cdac.dao.HostelRepo;
import com.prince.cdac.model.Hostel;

@Service
public class HostelServiceImpl implements HostelService {

	@Autowired
	private HostelRepo hostelRepo;
	
	@Override
	public Hostel saveDetails(Hostel hostel) {
		return hostelRepo.save(hostel);
	}

	@Override
	public Hostel updateDetails(Hostel hostel) {
		return hostelRepo.save(hostel);
	}

	@Override
	public void deleteDetails(Hostel hostel) {
		hostelRepo.delete(hostel);
		
	}

	@Override
	public Hostel getDetailsByPrn(long uId) {
		return hostelRepo.getOne(uId);
	}

	@Override
	public List<Hostel> getAllDetails() {
		return hostelRepo.findAll();
	}

}
