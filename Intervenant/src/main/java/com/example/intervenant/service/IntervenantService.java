package com.example.intervenant.service;

import com.example.intervenant.repository.IntervenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntervenantService {
    @Autowired
    private IntervenantRepository intervenantRepository;
   // @Autowired
   // private CommandeClient commandeClient;

 //   public Commande getCommandeById(Long id) {
   //     return commandeClient.getCommandeById(id);
    //}

  //  public void traiterCommande() {
        // Logic to process an order
   // }

   // public void visualiserCommandes() {
        // Logic to view orders
   // }

//    public void affecterReclamation() {
        // Logic to assign a complaint
  //  }

    //public void suivreReclamations() {
        // Logic to track complaints
    //}
}
