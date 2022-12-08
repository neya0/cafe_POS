package com.example.cage_pos.domain;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private List<Coffee> coffee;
}
