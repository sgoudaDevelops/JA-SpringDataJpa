package com.softtek.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKey;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Employee_info_Tab")
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Integer eno;
	@Column(length=20)
	private String ename;
	
	@ElementCollection // enables the collection mapping
	@CollectionTable(name="EMPLOYEES_FRIENDS",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName="eno"))
	@Column(name="FRIEND_NAME",length=20)// to store the list of elements
	@OrderColumn(name="FRIEND_INDEX")// to store the  list element index
	@ListIndexBase(1)// index starting with 1
	private List<String>friends;
	@ElementCollection
	@CollectionTable(name="EMPLOYEE_PHONES",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "eno"))
	@Column(name="PHONE_NUMBER")
	private Set<Long> phones;
	@ElementCollection
	@CollectionTable(name="EMPLOYEE_IDDETAILS",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "eno"))
	@Column(name="IDDETAILS")// TO STORE THE MAP ELEMENTS VALUES
	@MapKeyColumn(name="ID_TYPE",length = 20)// to store the element keys 
	private Map<String, Long>iDetails;

	

}
