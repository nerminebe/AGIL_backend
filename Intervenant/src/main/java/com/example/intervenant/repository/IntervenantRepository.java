package com.example.intervenant.repository;

import com.example.intervenant.entity.Intervenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntervenantRepository extends JpaRepository<Intervenant, String> {
}
