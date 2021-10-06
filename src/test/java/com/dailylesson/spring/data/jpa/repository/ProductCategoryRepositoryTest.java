package com.dailylesson.spring.data.jpa.repository;

import com.dailylesson.spring.data.jpa.entity.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    /*@Test
    public void printAllProductCategory(){
        List<ProductCategory> productCategories =
                repository.findAll();
        System.out.println("product category "+ productCategories);
    }

    @Test
    public void saveProductCategory(){
        ProductCategory productCategory = ProductCategory.builder()
                .categoryName("Olahraga")
                .build();
        repository.save(productCategory);
    }

    @Test
    public void findById(){
        Optional<ProductCategory> productCategory = repository.findById(6L);
        System.out.println("product category "+productCategory.get());
    }*/
}