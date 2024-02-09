package com.examplegpql.ecom.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    private String name;
    private String description;
    private ArrayList<Product> products;

    public void addProductToList(Product product) {
        if (product == null) {
            return;
        }

        if (products == null) {
            products = new ArrayList<>();
            products.add(product);
        } else {
            products.add(product);
        }
    }

}
