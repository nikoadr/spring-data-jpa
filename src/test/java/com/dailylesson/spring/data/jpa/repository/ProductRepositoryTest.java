package com.dailylesson.spring.data.jpa.repository;

import com.dailylesson.spring.data.jpa.entity.Product;
import com.dailylesson.spring.data.jpa.entity.ProductCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

   /* @Test
    public void saveProduct(){
        Optional<ProductCategory> productCategory = productCategoryRepository.findById(7L);
        Product product1 =  Product.builder()
                .productName("Bola Basket")
                .productCategory(productCategory.get())
                .productPrice(5000F)
                .build();
        Product product2 =  Product.builder()
                .productName("Bola Tenis")
                .productCategory(productCategory.get())
                .productPrice(800F)
                .build();

        Product product3 =  Product.builder()
                .productName("Bola Badminton/Cock")
                .productCategory(productCategory.get())
                .productPrice(6000F)
                .build();
        productRepository.saveAll(List.of(product1,product2,product3));
    }*/

    /*@Test
    public void findAllPagination(){
        Pageable withThreeRecords = PageRequest.of(0,2
        );
        List<Product> productList = productRepository.findAll(withThreeRecords).getContent();
        System.out.println("product list " + productList);

    }
    @Test
    public void printAllProduct(){
        List<Product> productList = productRepository.findAll();
    }*/
}