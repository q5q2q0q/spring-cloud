package com.fh.product.biz;


import com.fh.common.ServerResponse;
import com.fh.product.po.Product;

import java.util.List;

public interface IProductService {


    ServerResponse findList();

    List<Product> findStockJob();
}
