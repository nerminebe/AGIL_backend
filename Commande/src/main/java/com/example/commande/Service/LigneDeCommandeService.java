package com.example.commande.Service;

import com.example.commande.repository.LigneDeCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneDeCommandeService {
    @Autowired
    private LigneDeCommandeRepository ligneDeCommandeRepository;

    public boolean recupererListeProduit() {
        // Logic to retrieve product list
        return true;
    }
}