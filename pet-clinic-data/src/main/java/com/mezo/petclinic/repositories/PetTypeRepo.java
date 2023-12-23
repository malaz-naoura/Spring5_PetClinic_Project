package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepo extends CrudRepository<PetType, Long> {
}
