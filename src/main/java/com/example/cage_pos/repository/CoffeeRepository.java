package com.example.cage_pos.repository;

import com.example.cage_pos.domain.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    List<Coffee> findAllByTypeOrderByName(String type);
    Optional<Coffee> findById(Long Id);
}
