package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepo extends CrudRepository<Pet, Long> {
}
