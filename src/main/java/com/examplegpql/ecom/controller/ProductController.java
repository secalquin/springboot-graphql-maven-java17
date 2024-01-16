package com.examplegpql.ecom.controller;

import com.examplegpql.ecom.entities.Category;
import com.examplegpql.ecom.entities.Product;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @QueryMapping
    public List<Product> productList() {

        Category category1 = Category.builder().name("Shoes").description("Shoes 50% off").build();

        Product product1 = Product.builder().name("Product1").price(0.12).description("This is example product1").build();
        Product product2 = Product.builder().name("Product2").price(0.11).description("This is example product2").build();

        category1.setProducts(new Product[]{product1, product2});
        product1.setCategories(new Category[]{category1});

        return List.of(product1, product2);
    }

}
