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
public class StationService {
    @Id
    private int id;
    private String nom;
    private String adresse;
    private String ville;

    @ManyToOne
    @JoinColumn(name = "matriculeGerant")
    private Gerant gerant;


}
