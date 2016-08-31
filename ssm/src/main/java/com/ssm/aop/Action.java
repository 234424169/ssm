package com.ssm.aop;

import java.lang.annotation.*;

/**
 * Created by chen on 2016/8/30.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
