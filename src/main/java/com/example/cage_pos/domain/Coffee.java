package com.example.cage_pos.domain;

import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
public abstract class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    private String temp;
    @Column
    private long salesCount = 0L;

    public Coffee (CoffeeRequestDto requestDto) {
        this.name = requestDto.getName();
        this.price = requestDto.getPrice();
        this.temp = requestDto.getTemp();
    }

    public void updateCoffee (CoffeeRequestDto requestDto) {
        this.name = requestDto.getName();
        this.temp = requestDto.getTemp();
        this.price = requestDto.getPrice();
    }

    public void updateCount (long count) {
        this.salesCount = count;
    }

}

