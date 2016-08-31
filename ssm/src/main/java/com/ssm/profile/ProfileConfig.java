package com.ssm.profile;

import com.ssm.pojo.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by chen on 2016/8/31.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public Product devBean(){
        Product p=new Product();
        p.setProductname("测试产品");
        return p;
    }

    @Bean
    @Profile("pro")
    public Product proBean(){
        Product p=new Product();
        p.setProductname("生产产品");
        return p;
    }
}
