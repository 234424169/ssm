package com.ssm.controller;

import com.ssm.aop.DemoAnnotationService;
import com.ssm.aop.DemoMethodService;
import com.ssm.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chen on 2016/8/26.
 */
@Controller
@RequestMapping("test")
public class TestController {
//    @RequestMapping(value="test1",method= RequestMethod.GET)
//    public ModelAndView Test1(){
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("test1");
//        return modelAndView;
//    }
    @RequestMapping(value="test1",method = RequestMethod.GET)
    @ResponseBody  public  Product Test2(Product p){

        p.setProductcode("YNG");
        p.setProductname("邮你购");

        return p;

    }

    @RequestMapping(value="testRequestBody",method = RequestMethod.POST)
     public  void TestRequestBody(@RequestBody  Product p){

       System.out.println(p.getProductcode());
        System.out.print(p.getProductname());


    }
    @Autowired
    private DemoAnnotationService  demoAnnotationService;

    @Autowired
    private DemoMethodService  demoMethodService;

    @RequestMapping(value="testAOP",method = RequestMethod.GET)
    public  void TestAOP(){
        demoAnnotationService.add();
        demoMethodService.add();


    }

    @RequestMapping(value="testException",method = RequestMethod.GET)
    public  void TestException() throws Exception {


            int i=1/0;


    }
}
