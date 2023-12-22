package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Pet;
import com.mezo.petclinic.service.CrudService;

public interface PetRepo extends CrudService<Pet, Long> {
}
