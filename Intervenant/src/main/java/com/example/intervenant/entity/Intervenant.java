package com.example.intervenant.entity;

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
public class Intervenant {
    @Id
    private String nom;
    private String prenom;
    private String type;

    //@OneToMany(mappedBy = "intervenant")
   // private List<Commande> commandes;

   // @OneToMany(mappedBy = "intervenant")
    //private List<Reclamation> reclamations;

}
