package com.example.reclamation.service;

import com.example.reclamation.repository.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository;

    public void traiterReclamation() {
        // Logic to process a complaint
    }

    public void suivreEtat() {
        // Logic to track the state of a complaint
    }
}
