package com.ssm.aop;

import org.springframework.stereotype.Service;

/**
 * Created by chen on 2016/8/30.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解 拦截 add")
    public void add(){
        System.out.println("执行annotation");
    }

}
