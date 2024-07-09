package com.example.commande.repository;


import com.example.commande.entity.LigneDeCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande, String> {
}
