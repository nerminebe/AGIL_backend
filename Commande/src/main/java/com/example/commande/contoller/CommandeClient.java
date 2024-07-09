package com.example.commande.contoller;

import com.example.commande.entity.Commande;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "commande")
public interface CommandeClient {
    @GetMapping("/commandes/{id}")
    Commande getCommandeById(@PathVariable("id") Long id);

    // Ajoutez d'autres méthodes nécessaires pour les appels API que vous avez besoin.
}
