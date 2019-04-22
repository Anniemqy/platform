package com.hiveview.action;

import com.google.common.collect.Maps;
import com.hiveview.entity.Product1;
import com.hiveview.service.IProduct1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author huxunqiang created on 2019/4/14
 */

@Controller
@RequestMapping("/product1")
public class Product1Controller {
    @Autowired
    private IProduct1Service product1Service;

    @ResponseBody
    @RequestMapping("/getProduct1One")
    public Map<String,Object> getProduct1One(Long productId) {
        Map<String, Object> result = Maps.newHashMap();
        Boolean flag = true;
        try {
            List<Product1> products= product1Service.getProduct1One(productId);
            if (products != null && !products.isEmpty()) {

            }
            result.put("products",products);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        result.put("flag",flag);
        return result;
    }

    // 添加产品
    @ResponseBody
    @RequestMapping("/addProduct")
    public Long addProduct(Product1 product1){
        Boolean flag = true;
        Long productId = null;
        try {
            product1.setAddTime(new Date());
            Integer addNum = product1Service.addProduct(product1);
            productId = product1.getId();
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        return productId;
    }
}
