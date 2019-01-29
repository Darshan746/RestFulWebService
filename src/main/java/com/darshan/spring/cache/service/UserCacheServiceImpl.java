package com.darshan.spring.cache.service;

import com.darshan.spring.cache.model.UserCacheModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames={"usersCache"}) // tells Spring where to store cache for this class
public class UserCacheServiceImpl implements  UserCacheService {

  private List<UserCacheModel> users = new ArrayList<>();

  @Autowired
  UserCacheServiceImpl (){
  }

  @PostConstruct
  public void initializeuser(){
    users.add(new UserCacheModel(1,"Rahul"));
    users.add(new UserCacheModel(2 ,"Pandya"));
    users.add(new UserCacheModel(3 ,"Sarvesh"));
  }

  @Cacheable // caches the result of findAll() method
  public List<UserCacheModel> findAll() {
    System.out.print("Method got hit");
    simulateSlowService();
    return this.users;
  }

  /**
   * @CachePut — always lets the method execute.
   * It is used to update the cache with the result of the method execution.
   * @return
   */
  @CachePut(cacheNames = "usersCache")
  public List<UserCacheModel> updateUsers() {
    this.users.set(0, new UserCacheModel(2,"RamRam"));
    return this.users;
  }
  private void simulateSlowService() {
    try {
      Thread.sleep(3000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
