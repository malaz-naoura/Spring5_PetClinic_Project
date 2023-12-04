package com.mezo.petclinic.service;

import com.mezo.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet save(Pet pet);

    Pet findById(Long id);

    Set<Pet> findAll();
}
