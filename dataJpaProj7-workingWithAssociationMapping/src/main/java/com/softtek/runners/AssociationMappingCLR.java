package com.softtek.runners;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.softtek.entities.Person;
import com.softtek.entities.PhoneNumber;
import com.softtek.repositories.phoneNumber;
import com.softtek.service.IpersonServiceMGMT;
import com.softtek.service.personServiceIMpl;

@Component
public class AssociationMappingCLR implements CommandLineRunner {
	@Autowired
	private IpersonServiceMGMT personService;

	@Override
	public void run(String... args) throws Exception {
		// save the object operation()parent to child
//		Person p1= new Person();
//		p1.setPname("Shivanagoud");
//		p1.setEaddrs("Banglore");
//		
//		// child to parent Many to One
//		 PhoneNumber ph1 = new PhoneNumber();
//		ph1.setNumberType("personal");
//		ph1.setPhoneNum(234567l);
//		ph1.setProvider("jio");
//		ph1.setPer(p1);
//		PhoneNumber ph2 = new PhoneNumber();
//		ph2.setNumberType("residence");
//		ph2.setPhoneNum(987654l);
//		ph2.setProvider("vi");
//		ph2.setPer(p1);
//		Set<PhoneNumber> phoneSet = Set.of(ph1,ph2); 
//		p1.setPhones(phoneSet);
//		
//		try {
//		personService.saveDataUsingPerson(p1);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		// -----------------------------------------by creating the phone
		// number-----------------
//		PhoneNumber ph1= new PhoneNumber();
//		ph1.setNumberType("office");
//		ph1.setPhoneNum(34567l);
//		ph1.setProvider("BSNL");
//		PhoneNumber ph2= new PhoneNumber();
//		ph2.setNumberType("office 2");
//		ph2.setProvider("jio");
//		ph2.setPhoneNum(357478l);
//		Person p1= new Person();
//		p1.setPname("rahul");
//		p1.setEaddrs("Manglore");
//		ph1.setPer(p1);
//		ph1.setPer(p1);
//		Set<PhoneNumber> phoneSet= new HashSet<PhoneNumber>();
//		phoneSet.add(ph1);
//		phoneSet.add(ph2);
//		
//		try {
//			String message = personService.saveDataUsingPhoneNUmbers(phoneSet);
//			System.out.println(message);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		System.out.println("-------------------------------------------------------------------------");
//		personService.loadDataUsingPage().forEach(Person->{
//			System.out.println("parent::"+Person);
//			Set<PhoneNumber> childs = Person.getPhones();
//			childs.forEach(ph->{
//				System.out.println("child::"+ph);
//			});
//			
//		});
		
//		System.out.println("-----------------------------proxy---------------------");
//		Iterable<PhoneNumber> loadDataUsingphone = personService.loadDataUsingphone();
//		loadDataUsingphone.forEach(ph -> {
//			System.out.println("child" + ph);
//			System.out.println(ph.getPer());
//		});
		
		String messageDelete = personService.deletePhoneNumbers(1);
		System.out.println(messageDelete);
		
		
	}

}
