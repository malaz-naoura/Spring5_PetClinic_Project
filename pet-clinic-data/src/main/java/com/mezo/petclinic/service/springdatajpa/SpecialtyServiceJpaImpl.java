package com.mezo.petclinic.service.springdatajpa;

import com.mezo.petclinic.model.Specialty;
import com.mezo.petclinic.repositories.SpecialtyRepo;
import com.mezo.petclinic.service.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

public class SpecialtyServiceJpaImpl implements SpecialtyService {
    private final SpecialtyRepo specialtyRepo;

    public SpecialtyServiceJpaImpl(SpecialtyRepo specialtyRepo) {
        this.specialtyRepo = specialtyRepo;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty>specialties=new HashSet<>();
        specialtyRepo.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepo.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepo.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepo.deleteById(aLong);

    }
}
