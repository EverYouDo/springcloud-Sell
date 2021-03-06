package com.guier.service;


import com.guier.dao.domain.ProductInfo;
import com.guier.stock.ProductInfoOutput;

import java.util.List;


public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
//    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
