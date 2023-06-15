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
	public Iterable<Actor> showActorsByOrder(boolean asc, String... Properties) {
		// prepare the sort object
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, Properties);
		// get the records by applying sorting
		Iterable<Actor> it = iactorrepository.findAll(sort);
		return it;
	}

	@Override
	public Page<Actor> showActorsByPage(int pageSize, int pagenum) {
		Pageable pageable = PageRequest.of(pagenum, pageSize);
		Page<Actor> page = iactorrepository.findAll(pageable);
		// page.forEach(System.out::println);
		return page;

	}
	public void showActorPageByPage(int pageSize){
		Long RecordsCount=iactorrepository.count();
		long pagescount=RecordsCount/pageSize;
		pagescount=(RecordsCount%pageSize==0)?pagescount:++pagescount;
		for(int i=0;i<=pagescount;i++)
		{
			Pageable pr = PageRequest.of(i,pageSize);	
			//Page<Actor> page = iactorrepository.findAll(pr);
//			List<Actor> content = page.getContent();
//			content.forEach(System.out::println);
			//page.getContent().forEach(System.out::println);
			//page.forEach(System.out::println);
			iactorrepository.findAll(pr).forEach(System.out::println);
		
		}
	}

	@Override
	public void showActorPaginationAndSorting(int pageSize, int pagenum, Sort sort) {
		// TODO Auto-generated method stub
		
	}

}
