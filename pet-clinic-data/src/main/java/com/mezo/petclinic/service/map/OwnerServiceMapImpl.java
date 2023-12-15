package com.mezo.petclinic.service.map;

import com.mezo.petclinic.model.Owner;
import com.mezo.petclinic.model.Pet;
import com.mezo.petclinic.model.PetType;
import com.mezo.petclinic.service.OwnerService;
import com.mezo.petclinic.service.PetService;
import com.mezo.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetService petService;

    public OwnerServiceMapImpl(PetTypeService petTypeService, PetService petService) {
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            object.getPets().forEach(pet -> {
                if (pet.getId() == null) {
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
