package com.softtek.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softtek.entities.Actor;
import com.softtek.entities.ResultView;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	// select * from datajpa.data_jpa_actor  where aname=?
	public List<Actor> findByAnameEquals(String name);
	// select * from datajpa.data_jpa_actor where aname=?
	public List<Actor> findByAnameIs(String name);
	//   select * from datajpa.data_jpa_actor where aname=? 
	public List<Actor> findByAname(String name);
	// select * from data_jpa_actor where aid between ? and ?
	public Iterable<Actor> findByAidBetween(int start, int end);
    // select * from data_jpa_actor where aname like %?
   
	public Iterable<Actor> findByAnameLike(String chars);
	// select * from data_jpa_actor where aname like ?%
	public Iterable<Actor> findByAnameStartingWith(String chars);
    // select * from data_jpa_actor where aname like %?%
	public Iterable<Actor> findByAnameContainingIgnoreCase(String chars);
	// select * from data_jpa_actor where upper(category) in (?,?,?)order by asc
	public Iterable<Actor> findByCategoryInIgnoreCaseOrderByAnameAsc(List<String> categories);
	public Iterable findByCategoryInIgnoreCaseOrderByAnameDesc(List<String> of);
	// select * from the data_jpa_actor where aid>=start and aid<=end
	public Iterable<Actor> findByAidGreaterThanEqualAndAidLessThanEqual(int start, int end);
	// select * from data_jpa_actor where status=1 or category
	 public Iterable<Actor> findByStatusTrueOrCategoryEquals(String category);
	 // select * from data_jpa_actor where (aid>? and aid<?) or upper(category) not in (?,?,?....)
	 public Iterable<Actor> findByAidGreaterThanAndAidLessThanAndCategoryNotIn(int start,int end,List<String> category);
	// select aid,aname from data_jpa_actor where upper(category)=?
	 public Iterable<ResultView> findByCategoryEqualsIgnoreCase(String Category);
	 // select aid. aname from data_jpa_actor where mobileNo=?
	 public ResultView findByMobileNo(Long MobileNo);
	 // select * from data_jpa_actor where mobileno=?
	 public Actor findBymobileNo(Long MobileNo);
	 //select * from from data_jpa_actor where status=? and category=?
	public Iterable<Actor> findByStatusAndCategory(boolean b, String string);
	//select * from data_jpa_actor where Catagory=?
	public Iterable<ResultView> findByCategory(String string);
	//select * from data_jpa_actor where mobileno=?
	public ResultView findByMobileNo(long l);
	
}
