package com.example.evaluation_2_jihed_larayedh.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assurance implements Serializable {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idAssurance;

    @Column
    private String designation;


    @Column
    private float montant;


    @ManyToOne
    private Beneficiare benficaire;


    @ManyToOne
    private Contrat contrat;

}
