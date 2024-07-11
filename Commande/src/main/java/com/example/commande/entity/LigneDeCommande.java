package com.example.commande.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LigneDeCommande {
    @Id
    private String reference;
    private int quantiteCommande;
    private int quantiteLivree;

    @ManyToOne
    @JoinColumn(name = "idCommande")
    private Commande commande;

   // @ManyToOne
    //@JoinColumn(name = "produitId")
    //private Produit produit;


}
