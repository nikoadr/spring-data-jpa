package com.dailylesson.spring.data.jpa.service;

import com.dailylesson.spring.data.jpa.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Niko Andrian on 10/1/2021
 * @project spring-data-jpa
 */
public interface ProductCategoryService {

    Page<ProductCategory> getData(Pageable pageable);
}
