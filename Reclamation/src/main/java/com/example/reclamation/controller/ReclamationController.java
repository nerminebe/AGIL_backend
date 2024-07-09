package com.example.reclamation.controller;


import com.example.reclamation.service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reclamations")
public class ReclamationController {
    @Autowired
    private ReclamationService reclamationService;

    @PostMapping("/traiterReclamation")
    public void traiterReclamation() {
        reclamationService.traiterReclamation();
    }

    @GetMapping("/suivreEtat")
    public void suivreEtat() {
        reclamationService.suivreEtat();
    }
}
