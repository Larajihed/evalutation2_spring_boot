package com.example.evaluation_2_jihed_larayedh.services;

import com.example.evaluation_2_jihed_larayedh.entities.Assurance;
import com.example.evaluation_2_jihed_larayedh.entities.Beneficiare;
import com.example.evaluation_2_jihed_larayedh.entities.Contrat;
import com.example.evaluation_2_jihed_larayedh.entities.TypeContrat;

import java.util.Set;

public interface IGestionAssuranceService {

     Beneficiare ajouterBeneficiaire (Beneficiare bf);
     Contrat ajouterContrat (Contrat c);

     Assurance ajouterAssurance (Assurance a, int cinBf, String matricule);

     Contrat getContratBf (int idBf);

     Set<Beneficiare> getBeneficairesByType (TypeContrat typeContrat);

     float getMontantBf (int cinBf);
}
