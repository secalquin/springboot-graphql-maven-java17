package com.examplegpql.ecom.controller;

import com.examplegpql.ecom.entities.Product;
import com.examplegpql.ecom.utils.RandomData;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class ProductController {

    private final RandomData randomProducts = new RandomData();

    @QueryMapping
    public ArrayList<Product> productList() {
        return randomProducts.generateProducts(3, 2);
    }

}
