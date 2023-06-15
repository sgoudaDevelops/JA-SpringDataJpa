package com.softtek.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softtek.entities.ResultView;
import com.softtek.repository.IActorRepository;

@Component
public class ActorRunner implements CommandLineRunner {
	@Autowired
	private IActorRepository repo;

	public ActorRunner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------------------------------------------");
		System.out.println(" Finder_method ");
		System.out.println("-------------------------------------------");
		repo.findByAnameEquals("A").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByAnameIs("Manish").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByAname("cat").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println(" Between ");
		System.out.println("-------------------------------------------");
		repo.findByAidBetween(1, 152).forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println(" Like ");
		System.out.println("-------------------------------------------");
		repo.findByAnameLike("r%").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByAnameStartingWith("c").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByAnameContainingIgnoreCase("m").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println(" Ignore Case and Order By ");
		System.out.println("-------------------------------------------");
		repo.findByCategoryInIgnoreCaseOrderByAnameAsc(List.of("parent", "father")).forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByAidGreaterThanEqualAndAidLessThanEqual(1, 152).forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println(" Status(boolean) ");
		System.out.println("-------------------------------------------");
		repo.findByStatusAndCategory(true, "hero").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		repo.findByStatusTrueOrCategoryEquals("hero").forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println("GreaterThan AndLessThan Or IgnoreCase NotIn");
		System.out.println("-------------------------------------------");
		repo.findByAidGreaterThanAndAidLessThanAndCategoryNotIn(1, 152, List.of("hero", "villian"))
				.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		Iterable<ResultView> findByCatagory = repo.findByCategory("parent");
		findByCatagory.forEach(veiw -> {
			System.out.println(veiw.getAid());
			System.out.println(veiw.getAname());
		});
		System.out.println("-------------------------------------------");
		ResultView view = repo.findByMobileNo(36789l);
		System.out.println("Mobile no : " + view.getMobileNo() + ", Name : " + view.getAname());// System.out.println(repo.findByMobileno(9999999999L)); 

	}

}
