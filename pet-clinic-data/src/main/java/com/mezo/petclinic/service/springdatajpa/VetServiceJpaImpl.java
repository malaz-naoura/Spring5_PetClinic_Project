package com.mezo.petclinic.service.springdatajpa;

import com.mezo.petclinic.model.Vet;
import com.mezo.petclinic.repositories.VetRepo;
import com.mezo.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")

public class VetServiceJpaImpl implements VetService {

    VetRepo vetRepo;

    public VetServiceJpaImpl(VetRepo vetRepo) {
        this.vetRepo = vetRepo;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet>vets=new HashSet<>();
        vetRepo.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepo.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepo.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepo.deleteById(aLong);
    }
}
