package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepo extends CrudRepository<Visit,Long> {
}
