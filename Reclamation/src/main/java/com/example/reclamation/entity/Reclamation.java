package com.example.reclamation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Reclamation {
    @Id
    private int id;
    private String type;
    private String description;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "responsable")
    private Utilisateur responsable;

    @ManyToOne
    @JoinColumn(name = "gerant")
    private Gerant gerant;

}
