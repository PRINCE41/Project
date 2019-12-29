package com.prince.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prince.cdac.model.RegistrationDetails;
import com.prince.cdac.model.Login;

public interface LoginRepo extends JpaRepository<Login, Long>{
	
	/*List<Alien> findByTech(String tech);

	List<Alien> findByAidLessThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname") //In JPA we use JPQL ~ HQL ~ SQL
	List<Alien> findByTechSorted(String tech);*/

}

