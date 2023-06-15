package com.softtek.runners;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softtek.entities.Actor;
import com.softtek.repositories.IActorRepository;
@Component
public class ActorRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository irepo;

	public ActorRunner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		// irepo.searchActorBYCategory("parent",4).forEach(System.out::println);;
		//irepo.findByActorsMobileNumbers(34567l,4567l,36789l).forEach(System.out::println);;
		
//		List<Object[]> dataByCategory = irepo.findActorsDataByCategory("parent", "father");
//		dataByCategory.forEach(obj->{
//          for (Object objects : obj) {
//        	  System.out.println(objects);
//        	  System.out.println();
//			
//		}
//          
//          
//		});
		
		
		//irepo.findActorNamesByStartWithLetters("r").forEach(System.out::println);;
		//System.out.println(irepo.getActorOnMobileNum(36789l)); // directly return Actor obj
		
//		Object object = irepo.getActorDataByMobno(36789l);
//		    Object resultset[]=(Object[])object;
//		    for (Object obj : resultset) {
//		    	System.out.println(obj);
//		    	System.out.println("----------------");
//			}
		
		
//		String actorDataByMobno = irepo.getActorDataByMobno(36789l);
//		System.out.println(actorDataByMobno);
		
//		Optional<Actor> aid = irepo.findByAid(5);
//		if(aid.isPresent()) System.out.println(aid.get());
//		Object object[] = (Object[])irepo.getObjectAggregateData();
//		for (Object obj : object) {
//			System.out.println(obj);
//			
////		}
//		System.out.println(object[1]);
//		System.out.println(object[2]);
//		System.out.println(object[0]);
		
		
		//System.out.println(	irepo.getActorDataByMaxActorId());
		
//		
//		//---------------------------------------------------------------------------------
//		int n = irepo.updateActorMobileNoBYAid(1233456l, 5);
//		System.out.println(n);
//		int i = irepo.deleteActorBYCategory("father");
//		System.out.println(i);
		
		
	}
}
