package com.example.gerant.repository;

import com.example.gerant.entity.Gerant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerantRepository extends JpaRepository<Gerant, Integer> {
}