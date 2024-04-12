package com.example.myrest1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.myrest1.dto.AuthorityDTO;
import com.example.myrest1.entity.Authority;
import com.example.myrest1.mapper.AuthorityMapper;
import com.example.myrest1.repo.AuthorityRepo;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class AuthorityService {

    private AuthorityRepo authorityRepo;

    public AuthorityDTO getAllAuthorites(){

        return AuthorityMapper.mapToAuthorityDTO(authorityRepo.getAuthorities());
     //   List<Authority> authoritiesList= authorityRepo.findAll();
    
    }


    public AuthorityDTO createAuthority(AuthorityDTO authorityDTO){

        
        Authority savedAuthority = authorityRepo.save(AuthorityMapper.mapToAuthority(authorityDTO));
        return AuthorityMapper.mapToAuthorityDTO(savedAuthority);
    }
    
}
