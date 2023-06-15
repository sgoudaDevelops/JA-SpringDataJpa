package com.softtek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.entities.Person;

import jakarta.transaction.Transactional;
@Transactional
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
