package com.hiveview.service;

import com.hiveview.entity.Product1;

import java.util.List;

/**
 * @author huxunqiang created on 2019/4/14
 */
public interface IProduct1Service {
    List<Product1> getProduct1One(Long publicId);

    Integer addProduct(Product1 product1);
}
