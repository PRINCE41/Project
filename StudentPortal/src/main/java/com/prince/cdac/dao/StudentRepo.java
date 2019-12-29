package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.SDetailsSaved;

public interface StudentRepo extends JpaRepository<SDetailsSaved, Long> {

}
