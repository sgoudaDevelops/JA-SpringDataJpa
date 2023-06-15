package com.softtek.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softtek.entities.Actor;

import jakarta.transaction.Transactional;
@Transactional
public interface IActorRepository extends JpaRepository<Actor, Integer> {
	// select * from actor where category=?
	//@Query("from Actor where category=?1")
	//@Query("from com.softtek.entities.Actor a where a.category=?1")
	//@Query("from Actor where category=:role") // named parameter
	@Query("select a from com.softtek.entities.Actor a where a.category=?1 and aid=?2")
	public Iterable<Actor> searchActorBYCategory(String role,int id);
	
	@Query("from Actor where category=:role")
	  public Iterable<Actor> searchActorBYCategory(@Param("role") String category);
	
	//@Query("from Actor where mobileNo in(:no1,:no2,:no3) order by aname")// using  named param
	@Query("from Actor where mobileNo in(?1,?2,?3) Order by aname")// using positional param
    public Iterable<Actor> findByActorsMobileNumbers(Long no1, Long no2, Long no3);
	
	
	// write a query from  table to select aid,aname,category order by aname
	 @Query("select aid,aname,category from Actor where category in (:cat1,:cat2) order by aname")
     public List<Object[]> findActorsDataByCategory(String cat1,String cat2); 

	// write a querry to select aname which start with a,---z
	//@Query("select aname from Actor where aname like ?1%") //using the postinal param 
	  @Query("select aname from Actor where aname like :Letters%") // using  named param
	  public List<String>  findActorNamesByStartWithLetters(String Letters);
	
	// write the querry to get unique obj
     @Query("from Actor where mobileNo=?1")
     public Actor getActorOnMobileNum(long mob);
	
	// writing a querry that returning single obj 
//    @Query("select aid,aname,category from Actor where mobileNo=?1")
//    public Object getActorDataByMobno(Long mobno);
	
	//querry that is returning string of field required 
	@Query("select aname from Actor where mobileNo=:mobno")
	public String getActorDataByMobno(Long mobno);
	
	// querry that is for checking finder to query method
	@Query("from Actor where aid=:aid")
	public Optional<Actor> findByAid(Integer aid);
	
	// querry to perform the aggregate functions 
	@Query("select count(*),max(aid),min(aid) from Actor")
	public Object getObjectAggregateData();
	
	// querry that performs subquerry
	@Query("from Actor where aid=(select max(aid)from Actor)")
	public Actor getActorDataByMaxActorId();
	
	
	//---------------------------------------------------------------------------------------------
	// querry to UPDATE 
	@Query("update Actor set mobileNo=?1 where aid=?2")
	@Modifying
	public int updateActorMobileNoBYAid(Long newmob, int id);
	
	@Query("delete from Actor where category=:role")
	@Modifying
	public int deleteActorBYCategory(String role);
	
	@Query("select aid,aname,category from Actor where category in (:cat1,:cat2) order by aname")
    public List<Actor[]> findActorsDataByCategory1(String cat1,String cat2); 
   

	
	
}
