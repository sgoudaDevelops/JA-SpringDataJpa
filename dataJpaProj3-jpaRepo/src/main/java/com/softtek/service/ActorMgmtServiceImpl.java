package com.softtek.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.softtek.entity.Actor;
import com.softtek.repository.IActorRepository;

@Service("actorService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private IActorRepository iactorrepository;

	@Override
	public String removeActorsByIdsInBatch(List<Integer> ids) {
		List<Actor> actors = iactorrepository.findAllById(ids);
		int count = actors.size();
		iactorrepository.deleteAllByIdInBatch(ids);
		return count + " numbers are deleted" ;
	}

	@Override
	public Actor SearchActorById(int id) {
		return 	iactorrepository.getReferenceById(id);
	}

	@Override
	public List<Actor> findAllByIds() {
		List<Actor> all = iactorrepository.findAll();
		//List<Actor> all = iactorrepository.findAll();
		return all;
	}



}
