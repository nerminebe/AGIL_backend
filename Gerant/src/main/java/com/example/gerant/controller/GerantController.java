package com.example.gerant.controller;

import com.example.gerant.service.GerantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/gerants")
public class GerantController {
    @Autowired
    private GerantService gerantService;

    @PostMapping("/passerCommande")
    public void passerCommande() {
        gerantService.passerCommande();
    }

    @PostMapping("/enregistrerReclamation")
    public void enregistrerReclamation() {
        gerantService.enregistrerReclamation();
    }

    @GetMapping("/suivreCommande")
    public void suivreCommande() {
        gerantService.suivreCommande();
    }
}
