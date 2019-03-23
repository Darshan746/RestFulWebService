package com.darshan.spring.controller;


import com.darshan.spring.aop.TrackTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.spring.model.UserInfo;
import com.darshan.spring.service.UserInfoService;

import javax.validation.constraints.Null;

@RestController
public class UserController {

	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/addUser")
	public void addUserInfo(@RequestBody UserInfo userInfo){
		userInfoService.addUserInf(userInfo);
	}
	

	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/secure/all")
	public String getSecure(){
		return "secured Access";
	}

	@GetMapping("/sayHello")
	@TrackTime
	public String sayHello(){

		return "Hello User";
	}

	@GetMapping("/exception")
	public String throwMessage(){
		throw new NullPointerException();
	}
}
