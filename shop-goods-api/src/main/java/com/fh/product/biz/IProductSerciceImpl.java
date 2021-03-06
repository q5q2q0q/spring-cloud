package com.fh.product.biz;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.common.ServerResponse;
import com.fh.common.SystemConstant;
import com.fh.product.mapper.IProductMapper;
import com.fh.product.po.Product;
import com.fh.util.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class IProductSerciceImpl implements IProductService {

  @Autowired
  private IProductMapper productMapper;




    @Override
    public ServerResponse findList() {
        String hotProductList = RedisUtil.get("hotProductList");
        if (StringUtils.isNotEmpty(hotProductList)) {
            List<Product> productList = JSONObject.parseArray(hotProductList, Product.class);
            // 续命
            RedisUtil.expire(SystemConstant.HOT_GOODS_LIST_KEY, SystemConstant.HOT_GOODS_LIST_KEY_EXPIRE);
            return ServerResponse.success(productList);
        }
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();
        productQueryWrapper.eq("isHot", 1);
        productQueryWrapper.eq("status", 1);
        List<Product> products = productMapper.selectList(productQueryWrapper);
        String productsJson = JSONObject.toJSONString(products);
        RedisUtil.set("hotProductList",productsJson);


        return ServerResponse.success(products);
    }

    @Override
    public List<Product> findStockJob() {
        QueryWrapper<Product> productQueryWrapper = new QueryWrapper<>();
        productQueryWrapper.lt("stock", 10);
        List<Product> products = productMapper.selectList(productQueryWrapper);
        return products;
    }

}
