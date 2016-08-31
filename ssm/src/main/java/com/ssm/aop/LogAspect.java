package com.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by chen on 2016/8/30.
 */
@org.aspectj.lang.annotation.Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Pointcut("@annotation(com.ssm.aop.Action)")
    public void annotationPointCut(){}

    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        logger.info("注解拦截 方法前");
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        logger.info("注解拦截 方法后");
    }

    @Around("annotationPointCut()")
    public void around(JoinPoint joinPoint) {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        logger.info("注解拦截 方法环绕");
    }

    @AfterThrowing("annotationPointCut()")
    public void afterThrowing(JoinPoint joinPoint) {
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解拦截 方法抛异常");
    }

    @Before("execution(* com.ssm.aop.DemoMethodService.*(..))")
    public void before2(JoinPoint joinPoint){
        MethodSignature signature=(MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法拦截"+method.getName());

    }
}
