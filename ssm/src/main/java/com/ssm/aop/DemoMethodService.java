package com.ssm.aop;

import org.springframework.stereotype.Service;

/**
 * Created by chen on 2016/8/30.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("执行Method");
    }
}
