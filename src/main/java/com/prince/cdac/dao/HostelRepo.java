package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.Hostel;

public interface HostelRepo extends JpaRepository<Hostel, Long> {

}
