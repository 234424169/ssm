package com.ssm.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chen on 2016/8/30.
 */
public class Main {
    public static void main(String[] args){
        //AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        //context.close();
    }
}
