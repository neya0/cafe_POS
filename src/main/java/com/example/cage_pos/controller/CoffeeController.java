package com.example.cage_pos.controller;

import com.example.cage_pos.domain.Coffee;
import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import com.example.cage_pos.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Description("커피 메뉴 추가")
    @PostMapping("/coffee")
    public String createCoffee (@RequestBody CoffeeRequestDto requestDto) {
        return coffeeService.createCoffee(requestDto);
    }

    @Description("커피 메뉴 목록")
    @GetMapping("/coffee/{type}")
    public List<Coffee> getCoffeeList (@PathVariable String type) {
        return coffeeService.getCoffeeList(type);
    }

    @Description("커피 메뉴 지우기")
    @DeleteMapping("/coffee")
    public String deleteCoffee (@RequestParam String type, @RequestParam Long id) {
        return coffeeService.deleteCoffee(type, id);
    }

    @Description("커피 메뉴 하나 불러오기")
    @GetMapping("/coffee")
    public Coffee getCoffee (@RequestParam String type, @RequestParam Long id) {
        System.out.println("type = " + type);
        System.out.println("id = " + id);
        return coffeeService.getCoffee(type, id);
    }
}
