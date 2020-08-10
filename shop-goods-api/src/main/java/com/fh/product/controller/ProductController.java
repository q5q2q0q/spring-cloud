package com.fh.product.controller;


import com.fh.common.ServerResponse;
import com.fh.product.biz.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/product")

public class ProductController {
    @Resource(name="productService")
    private IProductService productService;


    @GetMapping


    public ServerResponse findList(){
        return productService.findList();


    }

}
