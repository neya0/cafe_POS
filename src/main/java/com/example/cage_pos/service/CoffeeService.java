package com.example.cage_pos.service;

import com.example.cage_pos.domain.Coffee;
import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import com.example.cage_pos.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    /*
    * 커피 메뉴를 추가하는 API
    */
    public String createCoffee (CoffeeRequestDto requestDto) {

        Coffee  coffee = Coffee.builder().
                name(requestDto.getName()).
                price(requestDto.getPrice()).
                temp(requestDto.getTemp()).
                type(requestDto.getType()).
                build();

        coffeeRepository.save(coffee);

        return "success";
    }

    /*
    * 해당하는 커피 목록을 불러오는 API
    */
    public List<Coffee> getCoffeeList(String type){

        return coffeeRepository.findAllByTypeOrderByName(type);
    }

    /*
    * 커피 메뉴 지우기 API
    */
    public String deleteCoffee(Long id){

        Coffee coffee = coffeeRepository.findById(id).orElseThrow();

        coffeeRepository.delete(coffee);

        return "success";
    }
}

