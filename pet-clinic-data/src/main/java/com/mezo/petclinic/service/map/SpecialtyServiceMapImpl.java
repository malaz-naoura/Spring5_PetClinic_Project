package com.mezo.petclinic.service.map;

import com.mezo.petclinic.model.Specialty;
import com.mezo.petclinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialtyServiceMapImpl extends AbstractMapService<Specialty,Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return null;
    }

    @Override
    public Specialty findById(Long id) {
        return null;
    }

    @Override
    public Specialty save(Specialty object) {
        return null;
    }

    @Override
    public void delete(Specialty object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
