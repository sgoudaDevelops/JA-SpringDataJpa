package com.softtek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.softtek.entities.Actor;

import com.softtek.views.view;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	// dynamic projection
	public <T extends view> Iterable<T> findByCategoryContainingIgnoreCase(String letters, Class<T> clazz);
	public < T extends view> Iterable<T> findByAnameIgnoreCase(String Aname,Class<T> clazz);
	public < T extends view> Iterable<T>  findByAidStartingWith(int aid,Class<T> clazz);
}

