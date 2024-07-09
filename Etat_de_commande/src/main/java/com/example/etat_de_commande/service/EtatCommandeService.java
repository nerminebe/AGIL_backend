package com.example.etat_de_commande.service;

import com.example.etat_de_commande.repository.EtatCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtatCommandeService {
    @Autowired
    private EtatCommandeRepository etatCommandeRepository;
}
