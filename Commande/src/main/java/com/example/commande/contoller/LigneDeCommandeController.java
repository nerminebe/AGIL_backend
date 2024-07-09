package com.example.commande.contoller;

import com.example.commande.Service.LigneDeCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lignesDeCommande")
public class LigneDeCommandeController {
    @Autowired
    private LigneDeCommandeService ligneDeCommandeService;

    @GetMapping("/recupererListeProduit")
    public boolean recupererListeProduit() {
        return ligneDeCommandeService.recupererListeProduit();
    }
}