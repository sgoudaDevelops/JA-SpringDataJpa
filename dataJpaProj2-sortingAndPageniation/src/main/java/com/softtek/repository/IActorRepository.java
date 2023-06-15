package com.softtek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.softtek.entity.Actor;

public interface IActorRepository extends PagingAndSortingRepository<Actor, Integer>,CrudRepository<Actor, Integer>{

}
