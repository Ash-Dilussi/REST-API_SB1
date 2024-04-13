package com.example.myrest1.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.myrest1.entity.Authority;



public interface AuthorityRepo extends JpaRepository<Authority ,Integer>{

    // @Query(value= "Select * FROM AUTHORITY", nativeQuery= true)
    // Authority getAuthorities();

    @Query(value= "Select * FROM AUTHORITY WHERE AID= ?1", nativeQuery = true)
    Authority getAuthorityByAuthID(Integer aId);

     @Query(value= "Select * FROM AUTHORITY WHERE aclearance= ?1", nativeQuery = true)
     List<Authority> getAuthorityByAuthPOST(String aclearance);

     @Query(value= "Select * FROM AUTHORITY WHERE emps= ?1", nativeQuery = true)
     List<Authority> getAuthorityByAuthemps(Integer emps);

    // Iterable<T>


}
