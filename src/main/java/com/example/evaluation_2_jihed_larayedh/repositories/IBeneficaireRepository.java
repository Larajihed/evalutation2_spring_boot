package com.example.evaluation_2_jihed_larayedh.repositories;

import com.example.evaluation_2_jihed_larayedh.entities.Assurance;
import com.example.evaluation_2_jihed_larayedh.entities.Beneficiare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IBeneficaireRepository extends CrudRepository<Beneficiare, Integer> {

    Beneficiare findBeneficiareByIdBenef (int idbenef);

}
