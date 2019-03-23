package com.darshan.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AdvicesClass
{
  private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

  @AfterThrowing("execution(* com.*.*(..))")
  public void getException(JoinPoint jp){
    logger.info("Exception thrown Printing message "+jp.getKind());
  }
}
