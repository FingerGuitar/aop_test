package com.log_demo.demo.logdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
    //定义一个切点所有GetMapping注解修饰的方法会织入Advice
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void logAdvicePointcut(){}

    @Before("logAdvicePointcut()")
    public void logAdvice(){
        //逻辑处理

        System.err.println("你笑起来真好看 ");
    }

}
