package com.example.etat_de_commande.controller;

import com.example.etat_de_commande.service.EtatCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/etatCommandes")
public class EtatCommandeController {
    @Autowired
    private EtatCommandeService etatCommandeService;
}
