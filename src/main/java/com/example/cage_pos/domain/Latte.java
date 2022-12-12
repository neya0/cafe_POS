package com.example.cage_pos.domain;

import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Latte extends Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Latte (CoffeeRequestDto requestDto) {
        super(requestDto);
    }

}
