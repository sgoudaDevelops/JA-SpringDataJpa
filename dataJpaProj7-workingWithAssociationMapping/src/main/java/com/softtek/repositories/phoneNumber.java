package com.softtek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.softtek.entities.PhoneNumber;

import jakarta.transaction.Transactional;
@Transactional
public interface phoneNumber extends JpaRepository<PhoneNumber, Integer> {

	
}
