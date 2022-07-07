package com.omikuji.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omikuji.spring.domain.entity.Fortunemaster;
import com.omikuji.spring.repository.FortunemasterRepository;

@Service
public class FortunemasterServiceImpl implements FortunemasterService{

	private FortunemasterRepository fortunemasterRepository;
	
	@Override
	public List<Fortunemaster> selectAll() {
		return fortunemasterRepository.selectAll();
	}

}
