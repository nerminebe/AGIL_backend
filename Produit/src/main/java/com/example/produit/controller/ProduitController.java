package com.example.produit.controller;

import com.example.produit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/verifierDisponibilite")
    public boolean verifierDisponibilite() {
        return produitService.verifierDisponibilite();
    }
}
