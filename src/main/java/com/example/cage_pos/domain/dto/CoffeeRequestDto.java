package com.example.cage_pos.domain.dto;

import lombok.Getter;

@Getter
public class CoffeeRequestDto {
    private String type;
    private String name;
    private String temp;
    private int price;
}
