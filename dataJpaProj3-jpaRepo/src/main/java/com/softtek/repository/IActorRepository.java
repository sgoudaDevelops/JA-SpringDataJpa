package com.softtek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.softtek.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer>{

}
