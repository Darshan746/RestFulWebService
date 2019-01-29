package com.darshan.spring.cache.controller;

import com.darshan.spring.cache.model.UserCacheModel;
import com.darshan.spring.cache.service.UserCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCacheController {

  @Autowired
  UserCacheService userCacheService;


  @GetMapping("/cache/users")
  public List<UserCacheModel> getUserFromCache(){
    return userCacheService.findAll();
  };

  @GetMapping("/cache/update/users")
  public List<UserCacheModel> getUpdatedUser(){
    return userCacheService.updateUsers();
  };

}

