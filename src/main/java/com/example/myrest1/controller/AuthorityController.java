package com.example.myrest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myrest1.dto.AuthorityDTO;
import com.example.myrest1.service.AuthorityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value= "api/v1/authority")
@CrossOrigin
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/getauthorities")
    public AuthorityDTO getAuther() {

        return authorityService.getAllAuthorites();
    }

    @PostMapping("/createauthority")
    public AuthorityDTO createAuthor(@RequestBody AuthorityDTO authorityDTO) {
     

        return authorityService.createAuthority(authorityDTO);
    }
    


    
}
