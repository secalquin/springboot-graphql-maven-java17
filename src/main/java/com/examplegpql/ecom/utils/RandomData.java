package com.examplegpql.ecom.utils;

import com.examplegpql.ecom.entities.Category;
import com.examplegpql.ecom.entities.Product;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Data
public class RandomData {
    private ArrayList<String> categories = new ArrayList<>();

    public RandomData() {
        this.categories.addAll(Arrays.asList("sandals", "shorts", "suits", "garments", "rings", "sunglasses"));
    }

    public ArrayList<Product> generateProducts(int numberOfProducts, int numberOfCategories) {
        Random random = new Random();
        ArrayList<Category> randomCategories = new ArrayList<>();

        for (int i = 0; i < numberOfCategories; i++) {
            int randomCategoryNumber = random.nextInt(1, numberOfCategories);


            String randomCategoryName = "Category " + randomCategoryNumber;
            String randomCategoryDesc = "This is category " + randomCategoryNumber;
            Category category = Category.builder().name(randomCategoryName).description(randomCategoryDesc).build();
            randomCategories.add(category);
        }

        ArrayList<Product> randomProducts = new ArrayList<>();
        for (int i = 0; i < numberOfProducts; i++) {

            int randomCategoryNumber = random.nextInt(1, numberOfProducts);
            String randomIndexName = "Product " + randomCategoryNumber;
            String randomDescription = "Description " + randomCategoryNumber;

            int randomCategoryIndex = random.nextInt(1, numberOfCategories);
            Product product = Product.builder().name(randomIndexName).price(random.nextDouble()).description(randomDescription).categories(new Category[]{randomCategories.get(randomCategoryIndex)}).build();

            randomCategories.get(randomCategoryIndex).addProductToList(product);

            randomProducts.add(product);
        }

        return randomProducts;

    }


}
