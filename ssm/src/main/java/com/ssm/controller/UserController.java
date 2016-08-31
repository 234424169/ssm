package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import com.ssm.validator.ValidUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service类
    @Autowired
    private UserService userService;

    @Autowired
    private ValidUserBean validUserBean;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser(HttpServletRequest request)throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
           List<User> users = userService.findUser();
//        User user=new User();
//        user.setId(1);
//        user.setUsername("czy");
//        List<User>users =new ArrayList<User>();
//        users.add(user);
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        String username=request.getParameter("username");
        System.out.println(username);
        modelAndView.addObject("login",username);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }

    @RequestMapping(value="/addUser" ,method=RequestMethod.GET)
    public ModelAndView addUser(HttpServletRequest request) throws Exception{
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("validUserBean", validUserBean);
        modelAndView.setViewName("newUser");
        return modelAndView;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ModelAndView insertUser(
            @ModelAttribute("validUserBean") @Valid ValidUserBean validUserBean,
            BindingResult result, ModelAndView modelAndView) {
            if (!result.hasErrors()) {
                modelAndView.addObject("show", "ok");
            }
             modelAndView.setViewName("newUser");
        return modelAndView;
    }
}
