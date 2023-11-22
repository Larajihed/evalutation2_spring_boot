package com.example.evaluation_2_jihed_larayedh.services;

import com.example.evaluation_2_jihed_larayedh.entities.Assurance;
import com.example.evaluation_2_jihed_larayedh.entities.Beneficiare;
import com.example.evaluation_2_jihed_larayedh.entities.Contrat;
import com.example.evaluation_2_jihed_larayedh.entities.TypeContrat;
import com.example.evaluation_2_jihed_larayedh.repositories.IAssuranceRepository;
import com.example.evaluation_2_jihed_larayedh.repositories.IBeneficaireRepository;
import com.example.evaluation_2_jihed_larayedh.repositories.IContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class IGestionAssuranceImp implements IGestionAssuranceService{

    @Autowired
    IAssuranceRepository assuranceRepository;
    @Autowired
    IBeneficaireRepository beneficaireRepository;
    @Autowired
    IContratRepository contratRepository;

    @Override
    public Beneficiare ajouterBeneficiaire(Beneficiare bf) {
        beneficaireRepository.save(bf);
        return bf;
    }

    @Override
    public Contrat ajouterContrat(Contrat c) {

        contratRepository.save(c);
        return c;
    }

    @Override
    public Assurance ajouterAssurance(Assurance a, int cinBf, String matricule) {
        Beneficiare b = beneficaireRepository.findById(cinBf).orElse(null);
        Contrat c = contratRepository.findContratByMatricule(matricule);

        a.setBenficaire(b);
        a.setContrat(c);
        assuranceRepository.save(a);

        return a;

    }

    @Override
    public Contrat getContratBf(int idBf) {
        return null;
    }

    @Override
    public Set<Beneficiare> getBeneficairesByType(TypeContrat typeContrat) {
        return null;
    }

    @Override
    public float getMontantBf(int cinBf) {
        return 0;
    }
}
