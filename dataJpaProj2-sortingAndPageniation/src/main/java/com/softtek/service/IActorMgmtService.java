package com.softtek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.softtek.entity.Actor;

public interface IActorMgmtService {
	public Iterable<Actor> showActorsByOrder(boolean asc, String... Properties);
	public Page<Actor> showActorsByPage(int pageSize, int pagenum);
	public void showActorPageByPage(int pageSize);
	public void showActorPaginationAndSorting(int pageSize,int pagenum,Sort sort);
	
	

}
