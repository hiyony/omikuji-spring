package com.omikuji.spring.domain.entity;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FortunemasterRepository extends JpaRepository<Fortunemaster, String>{

	@Query(value = "SELECT * FROM fortunemaster", nativeQuery = true)
	List<Fortunemaster> findbyFortunemasterAll();
}
