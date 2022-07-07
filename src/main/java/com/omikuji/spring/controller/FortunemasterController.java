package com.omikuji.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omikuji.spring.domain.entity.Fortunemaster;
import com.omikuji.spring.service.FortunemasterService;

@RestController
@RequestMapping(value = "/sample")
public class FortunemasterController {

	@Autowired
	FortunemasterService fortunemasterService;
	
	@CrossOrigin
	@RequestMapping(value = "/")
	private List<Fortunemaster> all() {
		return fortunemasterService.selectAll();
	}
}
