package com.example.gerant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Gerant {
    @Id
    private int matricule;
    private String nom;
    private String prenom;
    private int telephone;
    private String depotLivreur;
    private String commercial;
    private String idStation;


    @ManyToOne
    @JoinColumn(name = "commercial")
    private User commercial;

    @ManyToOne
    @JoinColumn(name = "idStation")
    private StationService stationService;

}