package com.example.intervenant.controller;

import com.example.intervenant.service.IntervenantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/intervenants")
public class IntervenantController {
    @Autowired
    private IntervenantService intervenantService;

    @PostMapping("/traiterCommande")
    public void traiterCommande() {
        intervenantService.traiterCommande();
    }

    @GetMapping("/visualiserCommandes")
    public void visualiserCommandes() {
        intervenantService.visualiserCommandes();
    }

    @GetMapping("/commande/{id}")
    public Commande getCommandeById(@PathVariable Long id) {
        return intervenantService.getCommandeById(id);
    }

    @PostMapping("/affecterReclamation")
    public void affecterReclamation() {
        intervenantService.affecterReclamation();
    }

    @GetMapping("/suivreReclamations")
    public void suivreReclamations() {
        intervenantService.suivreReclamations();
    }
}
