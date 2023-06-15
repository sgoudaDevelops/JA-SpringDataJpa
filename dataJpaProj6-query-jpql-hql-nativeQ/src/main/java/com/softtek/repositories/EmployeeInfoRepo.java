package com.softtek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.softtek.entities.Employee;

public interface EmployeeInfoRepo extends JpaRepository<Employee, Integer> {

}
