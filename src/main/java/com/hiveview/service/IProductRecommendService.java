package com.hiveview.service;

import com.hiveview.entity.ProductRecommend;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface IProductRecommendService {


    List<ProductRecommend> getProductRecommendPage(ProductRecommend productRecommend);

    void updateRecommend(ProductRecommend productRecommend);

    void saveRecommend(ProductRecommend productRecommend);

    ProductRecommend getProductRecommendByPId(long productId);

    void deleteById(long productId);

    List<ProductRecommend> getHotProduct(ProductRecommend productRecommend);
}
