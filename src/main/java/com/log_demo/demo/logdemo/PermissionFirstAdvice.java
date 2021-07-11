package com.log_demo.demo.logdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class PermissionFirstAdvice {
    @Pointcut("@annotation(com.log_demo.demo.annotation.PermissionAnnotation)")
    private void permissionCheck(){}

    @Around("permissionCheck()")
    public Object permissionCheckFirst(ProceedingJoinPoint joinPoint){
        System.out.println("-------第一个切面----------："+System.currentTimeMillis());
        Object[] args = joinPoint.getArgs();
        return  args;
    }
}
