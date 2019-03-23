package com.darshan.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
public class ExcecutionTimeCalculator {

  private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

  @Around("execution(* com.darshan.spring.controller.*.*(..)) && @annotation(com.darshan.spring.aop.TrackTime)")
  public void calculateTime(ProceedingJoinPoint proceedingJoinPoint)  throws  Throwable{


    long statrtTime = System.currentTimeMillis();
    proceedingJoinPoint.proceed();
    long timeTaken = System.currentTimeMillis()-statrtTime;
    logger.info("Time taken to complete the "+ " "+timeTaken);
  }
}
