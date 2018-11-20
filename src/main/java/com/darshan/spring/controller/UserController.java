package com.darshan.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.spring.model.UserInfo;
import com.darshan.spring.service.UserInfoService;

@RestController
public class UserController {

	@Autowired
	UserInfoService userInfoService;

	@PostMapping("/addUser")
	public void addUserInfo(@RequestBody UserInfo userInfo){
		userInfoService.addUserInf(userInfo);
	}
}
