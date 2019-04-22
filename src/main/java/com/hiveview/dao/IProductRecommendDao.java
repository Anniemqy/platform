package com.hiveview.dao;

import com.hiveview.entity.ProductRecommend;

import java.util.List;

public interface IProductRecommendDao extends IBaseDao<ProductRecommend>{
    int deleteByPrimaryKey(Long id);

    int insert(ProductRecommend record);

    int insertSelective(ProductRecommend record);

    ProductRecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductRecommend record);

    int updateByPrimaryKey(ProductRecommend record);

    List<ProductRecommend> getHotProduct(ProductRecommend productRecommend);
}