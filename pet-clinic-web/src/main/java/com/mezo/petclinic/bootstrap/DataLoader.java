package com.mezo.petclinic.bootstrap;

import com.mezo.petclinic.model.Owner;
import com.mezo.petclinic.model.PetType;
import com.mezo.petclinic.model.Vet;
import com.mezo.petclinic.service.OwnerService;
import com.mezo.petclinic.service.PetTypeService;
import com.mezo.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("owner1_First");
        owner1.setSecondName("owner1_Second");

        Owner owner2 = new Owner();
        owner2.setFirstName("owner2_First");
        owner2.setSecondName("owner2_Second");

        ownerService.save(owner1);
        ownerService.save(owner2);
        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setFirstName("vet1_First");
        vet1.setSecondName("vet1_Second");

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2_First");
        vet2.setSecondName("vet2_Second");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");


    }
}
