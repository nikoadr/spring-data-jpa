package com.dailylesson.spring.data.jpa.entity;

import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name="tbl_product"
)
@ToString(exclude = "productCategory")
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long productId;
    private String productName;
    private Float productPrice;

    @ManyToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "category_id",
            referencedColumnName = "categoryId",
            nullable = true
    )
    private ProductCategory productCategory;



}
