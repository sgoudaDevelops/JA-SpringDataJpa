package com.softtek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.softtek.entity.Actor;

public interface IActorMgmtService {
	public String removeActorsByIdsInBatch(List<Integer>ids);
	public Actor SearchActorById(int id);
	List<Actor> findAllByIds();
	

}
