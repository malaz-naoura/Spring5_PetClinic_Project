package com.mezo.petclinic.service.springdatajpa;

import com.mezo.petclinic.model.PetType;
import com.mezo.petclinic.model.Vet;
import com.mezo.petclinic.repositories.PetTypeRepo;
import com.mezo.petclinic.repositories.VetRepo;
import com.mezo.petclinic.service.PetTypeService;
import com.mezo.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeServiceJpaImpl implements PetTypeService {

    PetTypeRepo petTypeRepo;

    @Override
    public Set<PetType> findAll() {
        Set<PetType>petTypes=new HashSet<>();
        petTypeRepo.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepo.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepo.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepo.deleteById(aLong);
    }
}
