package com.example.cage_pos.service;

import com.example.cage_pos.domain.Coffee;
import com.example.cage_pos.domain.Espresso;
import com.example.cage_pos.domain.Latte;
import com.example.cage_pos.domain.dto.CoffeeRequestDto;
import com.example.cage_pos.repository.EspressoRepository;
import com.example.cage_pos.repository.LatteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final LatteRepository latteRepository;
    private final EspressoRepository espressoRepository;

    /*
    * 커피 메뉴를 추가하는 API
    */
    public String createCoffee (CoffeeRequestDto requestDto) {

        if("Latte".equals(requestDto.getType())) {

            Latte latte = new Latte(requestDto);
            latteRepository.save(latte);

        } else if("Espresso".equals(requestDto.getType())) {

            Espresso espresso = new Espresso(requestDto);

            espressoRepository.save(espresso);

        }

        return "success";
    }

    /*
    * 해당하는 커피 목록을 불러오는 API
    */
    public List<Coffee> getCoffeeList (String type) {

        List<Coffee> coffees = new ArrayList<>();

        if("Latte".equals(type)) {

            List<Latte> lattes = latteRepository.findAllByOrderByName();
            coffees.addAll(lattes);

        } else if("Espresso".equals(type)) {

            List<Espresso> espressos = espressoRepository.findAllByOrderByName();
            coffees.addAll(espressos);

        }

        return coffees;
    }

    /*
    * 커피 메뉴 지우기 API
    */
    public String deleteCoffee (String type, Long id) {

        if("Latte".equals(type)) {

            Latte latte = latteRepository.findById(id).orElseThrow();
            latteRepository.delete(latte);

        } else if("Espresso".equals(type)) {

            Espresso espresso = espressoRepository.findById(id).orElseThrow();
            espressoRepository.delete(espresso);

        }

        return "success";
    }

    /*
    * 커피 하나 불러오기 API
    */
    public Coffee getCoffee (String type, Long id) {

        Coffee coffee;

        if("Latte".equals(type)) {

            coffee = latteRepository.findById(id).orElseThrow();
            return coffee;

        } else if("Espresso".equals(type)) {

            coffee = espressoRepository.findById(id).orElseThrow();
            return coffee;

        }

        return null;
    }

    /*
    * 커피 메뉴 수정 API
    */
    public Coffee updateCoffee (CoffeeRequestDto requestDto) {

        if("Latte".equals(requestDto.getType())) {

            Latte latte = latteRepository.findByName(requestDto.getName());

            latte.updateCoffee(requestDto);
            latteRepository.save(latte);

            return latte;

        } else if("Espresso".equals(requestDto.getType())) {

            Espresso espresso = espressoRepository.findByName(requestDto.getName());

            espresso.updateCoffee(requestDto);
            espressoRepository.save(espresso);

            return espresso;

        }

        return null;
    }
}

