package com.ssm.controller;

import com.ssm.pojo.Area;
import com.ssm.pojo.Product;
import com.ssm.service.ProductService;
import flexjson.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {

    //service类
    @Autowired
    private ProductService productService;


    /**
     * 增加产品控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/addProduct",method = RequestMethod.GET)
    public ModelAndView viewProduct(HttpServletRequest httpServletRequest)throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        Product product=new Product();
        modelAndView.addObject("Product",product);
        //设置响应的jsp视图
        modelAndView.setViewName("addProduct");

        return modelAndView;
    }

    @RequestMapping(value="/addProduct",method = RequestMethod.POST)
    public ModelAndView addProduct(Product product)throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        productService.addProduct(product);
        modelAndView.addObject("Product",product);
        modelAndView.addObject("result","ok");
        //设置响应的jsp视图
        modelAndView.setViewName("addProduct");

        return modelAndView;

    }

    @RequestMapping(value="/findProduct",method = RequestMethod.GET)
    public ModelAndView submitAreacode()throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        Area area=new Area();
        modelAndView.addObject("area",area);
        //设置响应的jsp视图
        modelAndView.setViewName("findProduct");

        return modelAndView;

    }

    @RequestMapping(value="/findProduct",method = RequestMethod.POST)
    public ModelAndView findProduct(Area area)throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<Product> products=productService.findProduct(area.getAreacode());
        modelAndView.addObject("products",products);
        String json="";
        for(Product product:products){
            json+=getJsonStrFromObj(product);
        }
        modelAndView.addObject("productjson",json);
        //设置响应的jsp视图
        modelAndView.setViewName("showProduct");

        return modelAndView;

    }

    public static String getJsonStrFromObj(Object obj) {
        JSONSerializer serializer = new JSONSerializer();
        return serializer.serialize(obj);
    }
}
