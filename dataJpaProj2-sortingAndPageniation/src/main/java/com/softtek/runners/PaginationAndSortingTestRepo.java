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
//	   System.out.println("------------------findAll------------- Sort Method");
//	   service.showActorsByOrder(false, "aname").forEach(System.out::println);
//	   System.out.println("-----------------find all(Sort sort) call---");
//	   service.showActorsByOrder(true, "aname","aid").forEach(System.out::println);
    	 
//    
//    	 System.out.println("-----------------pagination using the pageRequest---------");
//    	 Page<Actor> Page = service.showActorsByPage(3, 0);
//    	 List<Actor> content = Page.getContent();
//    	System.out.println("other info about page");    	
//    	content.forEach(System.out::println);
//    	System.out.println("other about of page");
//    	System.out.println("current page number:: "+Page.getNumber());
//    	System.out.println("total pages "+Page.getTotalPages());
//    	System.out.println("total records:: "+Page.getTotalElements());
//    	System.out.println("is it in the first Page::"+Page.isFirst());
//    	System.out.println("is it in the last Page::"+Page.isLast());
    	 
    	 System.out.println("------------------------------pagination all--------------");
    	 service.showActorPageByPage(2);
      }
     catch(Exception e)
     {
    	e.printStackTrace();
     }
	}
}
