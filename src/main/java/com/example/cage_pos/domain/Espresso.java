package com.example.cage_pos.domain;

import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Espresso extends Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Espresso (CoffeeRequestDto requestDto) {
        super(requestDto);
    }

}
