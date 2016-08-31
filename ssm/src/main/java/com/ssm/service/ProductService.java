package com.ssm.service;

import com.ssm.pojo.Product;

import java.util.List;


public interface ProductService {

    /**
     * 新增产品
     * @return
     * @throws Exception
     */
    void addProduct(Product product)throws Exception;
    List<Product> findProduct(String areacode)throws Exception;
}
