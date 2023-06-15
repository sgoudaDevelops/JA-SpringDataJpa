package com.softtek.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.entities.Person;
import com.softtek.entities.PhoneNumber;
import com.softtek.repositories.PersonRepo;
import com.softtek.repositories.phoneNumber;
@Service

public class personServiceIMpl implements IpersonServiceMGMT {
	@Autowired
	private PersonRepo personrepo;
	
	@Autowired
	private phoneNumber phrepo;

	@Override
	public String saveDataUsingPerson(Person pr) {
		
		return "Person and phone numbers are saved with"+personrepo.save(pr)+"id value";
		
	}

	@Override
	public String saveDataUsingPhoneNUmbers(Set<PhoneNumber> phoneSet) {
		  int count = phrepo.saveAll(phoneSet).size();
		return count + "no of phone objs are maped to person";
	}

	@Override
	public Iterable<Person> loadDataUsingPage() {
		List<Person> all = personrepo.findAll();
		return all;
	}

	@Override
	public Iterable<PhoneNumber> loadDataUsingphone() {
		Iterable<PhoneNumber> all = phrepo.findAll();
		return all;
	}

	@Override
	public String deletePhoneNumbers(int pid) {
		Optional<Person> id = personrepo.findById(pid);
		if(id.isEmpty())
		{
			System.out.println("Person didnt found with the id " +pid );
		}
		Person person = id.get();
		Set<PhoneNumber> phones = person.getPhones();
		int count=phones.size();
		phrepo.deleteAll(phones);
		person.setPhones(null);
		personrepo.save(person);
		return count + " no of phone numbers are deleted from account";
	}

}
