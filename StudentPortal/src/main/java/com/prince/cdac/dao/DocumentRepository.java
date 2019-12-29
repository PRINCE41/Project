package com.prince.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.prince.cdac.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
