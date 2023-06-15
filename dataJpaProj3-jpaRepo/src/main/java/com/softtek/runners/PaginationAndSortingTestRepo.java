package com.softtek.runners;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.softtek.entity.Actor;
import com.softtek.repository.IActorRepository;
import com.softtek.service.IActorMgmtService;

@Component
class PaginationAndSortingTestRepo implements CommandLineRunner {
	@Autowired
	private IActorMgmtService service;

	public PaginationAndSortingTestRepo() {

	}

	@Override
	public void run(String... args) throws Exception {
     try {
//    	 String message = service.removeActorsByIdsInBatch(List.of(1,2));
//    	 System.out.println(message);
    	
    	 // using jpa method finding the object 
//    	 Actor actor = service.SearchActorById(5);
//    	 System.out.println(actor);
    	 
    	 //finding all using jpa repository
    	List<Actor> list = service.findAllByIds();
    	list.forEach(System.out::println);
    	 
    	 // find all the methods using the crud repo
    	 List<Actor> findAllByIds = service.findAllByIds();
    	 findAllByIds.forEach(actor->System.out.println(actor));
    	 
      }
     catch(Exception e)
     {
    	e.printStackTrace();
     }
	}
}
