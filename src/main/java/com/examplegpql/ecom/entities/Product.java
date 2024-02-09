package com.examplegpql.ecom.entities;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {

    private String name;
    private double price;
    private String description;
    private Category[] categories;

}
