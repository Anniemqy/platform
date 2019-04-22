package com.hiveview.service.impl;

import com.hiveview.dao.IProductRecommendDao;
import com.hiveview.entity.ProductRecommend;
import com.hiveview.service.IProductRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class ProductRecommentServiceImpl implements IProductRecommendService {

    @Autowired
    private IProductRecommendDao productRecommendDao;


    @Override
    public List<ProductRecommend> getProductRecommendPage(ProductRecommend productRecommend) {
        return productRecommendDao.getList(productRecommend);
    }

    @Override
    public void updateRecommend(ProductRecommend productRecommend) {
        productRecommendDao.updateByPrimaryKeySelective(productRecommend);
    }

    @Override
    public void saveRecommend(ProductRecommend productRecommend) {
        productRecommendDao.insertSelective(productRecommend);
    }

    @Override
    public ProductRecommend getProductRecommendByPId(long productId) {
        ProductRecommend productRecommend = new ProductRecommend();
        productRecommend.setProductId(productId);
        List<ProductRecommend> productRecommends = productRecommendDao.getList(productRecommend);
        return Optional.ofNullable(productRecommends).filter(p -> p.size() >0).map(p1 -> p1.get(0)).orElse(null);
    }

    @Override
    public void deleteById(long productId) {
        productRecommendDao.deleteByPrimaryKey(productId);
    }

    @Override
    public List<ProductRecommend> getHotProduct(ProductRecommend productRecommend) {
        return productRecommendDao.getHotProduct(productRecommend);
    }
}
