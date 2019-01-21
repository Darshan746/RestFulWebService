package com.darshan.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());


  @Before("execution(* com.darshan.spring.controller.*.*(..))")
  public void before(JoinPoint joinPoint) {
    logger.info("Logger is logging");
  }

}
