package com.guier.dao.repository;

import com.guier.dao.domain.ProductCategory;
import com.guier.dao.domain.ProductInfo;
import com.guier.service.CategoryService;
import com.guier.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @Test
    public void findByProductStatus() {
        List<ProductInfo> infoList = productInfoRepository.findByProductStatus(0);
        System.out.println(infoList.toString());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryList = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
        System.out.println(categoryList.toString());
    }
    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        System.out.println(list);
    }    @Test
    public void findByCategoryTypeInService() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        System.out.println(list);
    }
}