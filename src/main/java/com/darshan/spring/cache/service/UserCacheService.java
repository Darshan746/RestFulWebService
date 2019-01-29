package com.darshan.spring.cache.service;

import com.darshan.spring.cache.model.UserCacheModel;

import java.util.List;

public interface UserCacheService {

  List<UserCacheModel> findAll();
  List<UserCacheModel> updateUsers();
}
