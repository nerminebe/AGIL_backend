package com.example.commande.Service;

import com.example.commande.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public void valider() {
        // Logic to validate an order
    }

    public void genererHistorique() {
        // Logic to generate order history
    }
}