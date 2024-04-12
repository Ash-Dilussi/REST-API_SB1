package com.example.myrest1.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.myrest1.entity.Authority;



public interface AuthorityRepo extends JpaRepository<Authority ,Integer>{

    @Query(value= "Select * FROM AUTHORITY", nativeQuery= true)
    Authority getAuthorities();


}
