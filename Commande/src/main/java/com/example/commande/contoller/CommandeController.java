package com.example.commande.contoller;

import com.example.commande.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
    @Autowired
    private CommandeService commandeService;

    @PostMapping("/valider")
    public void valider() {
        commandeService.valider();
    }

    @GetMapping("/genererHistorique")
    public void genererHistorique() {
        commandeService.genererHistorique();
    }
}