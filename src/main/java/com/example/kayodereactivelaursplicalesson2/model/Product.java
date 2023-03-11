package com.example.kayodereactivelaursplicalesson2.model;

/**
 * Created by Kayode.Ogunrinde on 3/11/2023.
 */

public class Product {
    public Product(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
