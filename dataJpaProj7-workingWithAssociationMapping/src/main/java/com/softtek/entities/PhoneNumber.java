package com.softtek.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter

@Table(name="Phone_Numbers_OTM")
public class PhoneNumber {
	
	public PhoneNumber() {
		super();
		System.out.println("PhoneNumber.o param constructor"+ this.getClass());
	}
	@Id
	@GeneratedValue
	private Integer regNo;
	private Long phoneNum;
	@Column(length=20)
	private String NumberType;
	@Column(length=20)
	private String provider;
	@ManyToOne(targetEntity = Person.class,cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="PERSON_ID",referencedColumnName = "PID")
	private Person per;
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNum=" + phoneNum + ", NumberType=" + NumberType + ", provider="
				+ provider + "]";
	}
	
	

}
