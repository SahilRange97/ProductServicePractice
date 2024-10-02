package com.example.demo3.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeProductServiceDto {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
