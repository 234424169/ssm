package com.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen on 2016/8/29.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {



    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,

                                         Object handler, Exception ex) {

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("ex", ex);

        // 根据不同错误转向不同页面
        System.out.println("错误"+ex.getCause());

        return new ModelAndView("error", model);



    }

}