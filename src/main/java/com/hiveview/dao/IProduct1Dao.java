package com.hiveview.dao;

import com.hiveview.entity.Product1;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huxunqiang created on 2019/4/14
 */
@Repository
public interface IProduct1Dao {
    List<Product1> getProduct1One(@Param("productId") Long productId);

    Integer addProduct(Product1 product1);
}
