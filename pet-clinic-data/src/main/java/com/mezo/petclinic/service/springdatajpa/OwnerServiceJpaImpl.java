package com.mezo.petclinic.service.springdatajpa;

import com.mezo.petclinic.model.Owner;
import com.mezo.petclinic.repositories.OwnerRepo;
import com.mezo.petclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerServiceJpaImpl implements OwnerService {
    private final OwnerRepo ownerRepo;

    public OwnerServiceJpaImpl(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners=new HashSet<>();
        ownerRepo.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepo.findById(aLong).orElse(null);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepo.findBySecondName(lastName);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepo.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepo.deleteById(aLong);
    }
}
