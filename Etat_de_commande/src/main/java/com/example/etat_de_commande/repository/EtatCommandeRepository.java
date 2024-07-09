package com.example.etat_de_commande.repository;

import com.example.etat_de_commande.Entity.EtatCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatCommandeRepository extends JpaRepository<EtatCommande, String> {
}

