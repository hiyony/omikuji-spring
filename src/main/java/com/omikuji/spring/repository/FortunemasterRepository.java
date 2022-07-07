package com.omikuji.spring.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.omikuji.spring.domain.entity.Fortunemaster;

@ConfigAutowireable
@Dao
public interface FortunemasterRepository {
	
	@Select
	public List<Fortunemaster> selectAll();
	
}
