package com.example.myrest1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myrest1.dto.AuthorityDTO;
import com.example.myrest1.service.AuthorityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value= "api/v1/authority")
@CrossOrigin
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/getauthorities")
    public List<AuthorityDTO> getAuther() {

        return authorityService.getAllAuthorites();
    }

    @GetMapping("/getauthority")
    public AuthorityDTO getauthid(@RequestParam Integer id) {

        //Optional<AuthorityDTO> auth= authorityService.getAutherbyid(id);
        AuthorityDTO auth= authorityService.getAutherbyid(id);
        //return (AuthorityDTO) auth.orElse(null);
        return auth;
        
    }
    
    @GetMapping("/getauthority1")
    public List<AuthorityDTO> getauthpost(@RequestParam String thepost) {
        
        List<AuthorityDTO> auths= authorityService.getAutherbypost(thepost);
        return auths;
        
    }

    @GetMapping("/getauthority2")
    public List<AuthorityDTO> getauthemps(@RequestParam Integer emps) {
        
        List<AuthorityDTO> auths= authorityService.getAutherbyemsp(emps);
        return auths;
        
    }

    @PostMapping("/createauthority")
    public AuthorityDTO createAuthor(@RequestBody AuthorityDTO authorityDTO) {
        
        return authorityService.createAuthority(authorityDTO);
    }
    


    
}
