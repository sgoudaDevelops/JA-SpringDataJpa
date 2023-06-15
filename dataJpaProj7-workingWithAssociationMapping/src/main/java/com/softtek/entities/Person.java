package com.softtek.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PERSON_OTM")
@Setter
@Getter

public class Person {

	public Person() {
		System.out.println("phone number:: 0-param constructor" + this.getClass());
	}

	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length = 20)
	private String pname;
	@Column(length = 20)
	private String eaddrs;
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "person")
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "PID")
	private Set<PhoneNumber> phones;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", eaddrs=" + eaddrs + "]";
	}

}
