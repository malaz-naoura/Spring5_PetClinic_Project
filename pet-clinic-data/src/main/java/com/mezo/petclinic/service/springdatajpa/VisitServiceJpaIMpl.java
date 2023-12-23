package com.mezo.petclinic.service.springdatajpa;

import com.mezo.petclinic.model.Visit;
import com.mezo.petclinic.repositories.VisitRepo;
import com.mezo.petclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitServiceJpaIMpl implements VisitService {
    private final VisitRepo visitRepo;

    public VisitServiceJpaIMpl(VisitRepo visitRepo) {
        this.visitRepo = visitRepo;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepo.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepo.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet()==null || object.getPet().getId()==null)
            throw new RuntimeException("can't create new visit record and the pet in not saved");
        return visitRepo.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepo.deleteById(aLong);
    }
}
