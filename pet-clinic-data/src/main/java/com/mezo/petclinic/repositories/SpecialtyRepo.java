package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepo extends CrudRepository<Specialty, Long> {
}
