package com.example.cage_pos.repository;

import com.example.cage_pos.domain.Latte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LatteRepository extends JpaRepository<Latte, Long> {
    List<Latte> findAllByOrderByName();
    Latte findByName(String name);
}
