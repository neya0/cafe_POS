package com.example.cage_pos.repository;

import com.example.cage_pos.domain.Espresso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspressoRepository extends JpaRepository<Espresso, Long> {
    List<Espresso> findAllByOrderByName();
    Espresso findByName(String name);
}
