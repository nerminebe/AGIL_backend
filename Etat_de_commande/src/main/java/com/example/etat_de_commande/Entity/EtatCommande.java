package com.example.etat_de_commande.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EtatCommande {
    @Id
    private String etat;

   // @OneToMany(mappedBy = "etatCommande")
   // private List<Commande> commandes;

}
