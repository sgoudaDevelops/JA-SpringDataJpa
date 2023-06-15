package com.softtek.runners;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.softtek.entities.Actor;

import com.softtek.repository.IActorRepository;
import com.softtek.views.ResultView1;
import com.softtek.views.ResultView2;
import com.softtek.views.ResultView3;

@Component
public class ActorRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository actorRepo;

	public ActorRunner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------resultView1---------------------------");
		Iterable<ResultView1> res1 = actorRepo.findByCategoryContainingIgnoreCase("heroo", ResultView1.class);
		res1.forEach(rs->{
			System.out.println(rs.getAid());
			System.out.println(rs.getAname());
		});
		System.out.println("-------------------resultView2-----------------------------");
		Iterable<ResultView2> rs2 = actorRepo.findByCategoryContainingIgnoreCase("parent", ResultView2.class);
		rs2.forEach(rs->{
			System.out.println(rs.getMobileNo());
			System.out.println(rs.getCategory());
		});
		System.out.println("-------------------resultView3---------------------------");
		Iterable<ResultView3> rs3 = actorRepo.findByCategoryContainingIgnoreCase("heroine", ResultView3.class);
		rs3.forEach(rs->{
			System.out.println(rs.getAid());
			System.out.println(rs.getAname());
			System.out.println(rs.getCategory());
		});
	}

}
