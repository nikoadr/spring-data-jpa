package com.dailylesson.spring.data.jpa.service.impl;

import com.dailylesson.spring.data.jpa.entity.ProductCategory;
import com.dailylesson.spring.data.jpa.repository.ProductCategoryRepository;
import com.dailylesson.spring.data.jpa.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author Niko Andrian on 10/1/2021
 * @project spring-data-jpa
 */

@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public Page<ProductCategory> getData(Pageable pageable){
        return productCategoryRepository.findAll(pageable);
    }
}
