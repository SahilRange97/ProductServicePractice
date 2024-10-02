package com.example.demo3.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private Category category;
}
