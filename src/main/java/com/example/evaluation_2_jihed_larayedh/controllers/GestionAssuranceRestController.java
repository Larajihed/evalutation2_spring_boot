package com.example.evaluation_2_jihed_larayedh.controllers;


import com.example.evaluation_2_jihed_larayedh.entities.Assurance;
import com.example.evaluation_2_jihed_larayedh.entities.Beneficiare;
import com.example.evaluation_2_jihed_larayedh.entities.Contrat;
import com.example.evaluation_2_jihed_larayedh.repositories.IAssuranceRepository;
import com.example.evaluation_2_jihed_larayedh.repositories.IBeneficaireRepository;
import com.example.evaluation_2_jihed_larayedh.repositories.IContratRepository;
import com.example.evaluation_2_jihed_larayedh.services.IGestionAssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assurance")
public class GestionAssuranceRestController {

    @Autowired
    IGestionAssuranceService gestionAssuranceService;

    @Autowired
    IAssuranceRepository assuranceRepository;

    @Autowired
    IContratRepository contratRepository;

    @Autowired
    IBeneficaireRepository beneficaireRepository;

    @PostMapping("/addcontrat")
    public Contrat ajouterContrat(@RequestBody Contrat c){
        gestionAssuranceService.ajouterContrat(c);
        return c;
    }

    @PostMapping("/addbeneficiare")
    public void ajouterBeneficiaire(@RequestBody Beneficiare b){
        gestionAssuranceService.ajouterBeneficiaire(b);
    }

    @PostMapping("/addassurance/{idbenef}/{idcontrat}")
    public void ajouterAssurance(@RequestBody Assurance a, @PathVariable("idbenef") int idbenef, @PathVariable("idcontrat") String idcontrat){
        Contrat c = contratRepository.findById(idcontrat).orElse(null);
        Beneficiare b = beneficaireRepository.findById(idbenef).orElse(null);
        gestionAssuranceService.ajouterAssurance(a, b.getCin(), c.getMatricule());
    }


}
