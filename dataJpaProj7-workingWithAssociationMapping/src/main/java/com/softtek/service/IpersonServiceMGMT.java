package com.softtek.service;

import java.util.Set;

import com.softtek.entities.Person;
import com.softtek.entities.PhoneNumber;
import com.softtek.repositories.phoneNumber;

public interface IpersonServiceMGMT {
	 public String saveDataUsingPerson(Person pr);
	 public String saveDataUsingPhoneNUmbers(Set<PhoneNumber> phoneSet);
	public  Iterable<Person> loadDataUsingPage();
	public Iterable<PhoneNumber> loadDataUsingphone();
	public String deletePhoneNumbers(int pid);

}
