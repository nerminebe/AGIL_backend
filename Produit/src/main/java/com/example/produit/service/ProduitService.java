package com.example.produit.service;

import com.example.produit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public boolean verifierDisponibilite() {
        // Logic to check product availability
        return true;
    }
}
