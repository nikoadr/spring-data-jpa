package com.dailylesson.spring.data.jpa.controller;

import com.dailylesson.spring.data.jpa.entity.ProductCategory;
import com.dailylesson.spring.data.jpa.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Niko Andrian on 10/1/2021
 * @project spring-data-jpa
 */
@RestController
@RequestMapping("/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(value="/get")
    Page<ProductCategory> getData(Pageable pageable){
        return productCategoryService.getData(pageable);
    }
}
