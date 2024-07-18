package com.example.commande.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Commande {
    @Id
    private int id;
    private Date date;
    private float montant;
    private String nomDuChauffeur;
    private int tel;
    private String referenceCommande;

    @OneToMany(mappedBy = "commande")
    private List<LigneDeCommande> lignesDeCommande;// Getters and setters
}
