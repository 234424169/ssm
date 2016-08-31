package com.ssm.service;

import com.ssm.mapper.ProductMapper;
import com.ssm.pojo.Product;
import com.ssm.pojo.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    //User接口
    @Autowired
    private ProductMapper productMapper;

    public void addProduct (Product product) throws Exception {
        productMapper.insert(product);
    }

    @Override
    public List<Product> findProduct(String areacode) throws Exception {

        return productMapper.selectByAreacode(areacode);

    }
}
