package com.example.evaluation_2_jihed_larayedh.repositories;

import com.example.evaluation_2_jihed_larayedh.entities.Assurance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAssuranceRepository extends CrudRepository<Assurance, Integer> {
}
