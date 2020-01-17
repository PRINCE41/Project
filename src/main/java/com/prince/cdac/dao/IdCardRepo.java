package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.cdac.model.IdCard;

public interface IdCardRepo extends JpaRepository<IdCard, Long> {

}
