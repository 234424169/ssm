package com.ssm.service;

//import com.elin4it.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Service
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
            List<User> users = userMapper.selectByExample(null);
//        List<User> users=new ArrayList<User>();
//        User test =new User();
//        test.setId(2);
//        test.setUsername("3323");
//        users.add(test);
        return users;
    }
}
