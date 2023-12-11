package com.mezo.petclinic.bootstrap;

import com.mezo.petclinic.model.Owner;
import com.mezo.petclinic.model.Vet;
import com.mezo.petclinic.service.OwnerService;
import com.mezo.petclinic.service.map.OwnerServiceMapImpl;
import com.mezo.petclinic.service.VetService;
import com.mezo.petclinic.service.map.VetServiceMapImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("owner1_First");
        owner1.setSecondName("owner1_Second");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("owner2_First");
        owner2.setSecondName("owner2_Second");

        ownerService.save(owner1);
        ownerService.save(owner2);
        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("vet1_First");
        vet1.setSecondName("vet1_Second");

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("vet2_First");
        vet2.setSecondName("vet2_Second");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");


    }
}
