package com.example.evaluation_2_jihed_larayedh.repositories;

import com.example.evaluation_2_jihed_larayedh.entities.Beneficiare;
import com.example.evaluation_2_jihed_larayedh.entities.Contrat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IContratRepository extends CrudRepository<Contrat, String> {

    Contrat findContratByMatricule(String m);

}
