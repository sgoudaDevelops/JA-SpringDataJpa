package com.softtek.runners;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softtek.entities.Employee;
import com.softtek.repositories.EmployeeInfoRepo;
@Component
public class CollectionMapingTestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeInfoRepo emprepo;

	public CollectionMapingTestRunner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1= new Employee();
		e1.setEname("shiavn");
		e1.setFriends(List.of("ram","sham"));
		e1.setPhones(Set.of(1345673l,4356782l));
        e1.setIDetails(Map.of("adahr",2345678456l,"panno",234567898765l));
        
        // save the object 
        System.out.println("Employee is saved with::"+emprepo.save(e1).getEno()+" id value");
        emprepo.findAll().forEach(System.out::println);
        
	}

}
