package com.example.evaluation_2_jihed_larayedh.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Beneficiare implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idBenef;

    @Column
    private int cin;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String profession;

    @Column
    private float Salaire;


    @JsonIgnore
    @OneToMany(mappedBy = "benficaire", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<Assurance> assurances;

}
