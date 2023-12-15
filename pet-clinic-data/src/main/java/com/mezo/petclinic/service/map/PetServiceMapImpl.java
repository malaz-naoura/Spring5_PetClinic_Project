package com.mezo.petclinic.service.map;

import com.mezo.petclinic.model.Pet;
import com.mezo.petclinic.model.PetType;
import com.mezo.petclinic.service.PetService;
import com.mezo.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements PetService {
    private final PetTypeService petTypeService;

    public PetServiceMapImpl(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        PetType currPetType = object.getType();
        if (currPetType != null) {
            if (currPetType.getId() == null) {
                PetType savePetType = petTypeService.save(currPetType);
                object.getType().setId(savePetType.getId());
            }
        } else {
            throw new RuntimeException("Pet Type can't be null");
        }
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
