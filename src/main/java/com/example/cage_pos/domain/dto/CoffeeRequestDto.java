package com.example.cage_pos.domain.dto;

import lombok.Getter;

@Getter
public class CoffeeRequestDto {
    private String type;
    private int price;
    private String name;
    private String temp;
}
