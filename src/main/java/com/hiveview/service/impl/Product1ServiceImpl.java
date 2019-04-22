package com.hiveview.service.impl;

import com.hiveview.dao.IProduct1Dao;
import com.hiveview.entity.Product1;
import com.hiveview.service.IProduct1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huxunqiang created on 2019/4/14
 */
@Service
public class Product1ServiceImpl implements IProduct1Service {
    @Autowired
    private IProduct1Dao product1Dao;

    @Override
    public List<Product1> getProduct1One(Long productId) {
        return product1Dao.getProduct1One(productId);
    }

    @Override
    public Integer addProduct(Product1 product1) {
        return product1Dao.addProduct(product1);
    }
}
