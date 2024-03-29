package com.mezo.petclinic.bootstrap;

import com.mezo.petclinic.model.*;
import com.mezo.petclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final VisitService visitService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, VisitService visitService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.visitService = visitService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        // Pet Types
        PetType dog=new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        // Owner 1
        Owner owner1 = new Owner();
        owner1.setFirstName("owner1_First");
        owner1.setLastName("owner1_Second");
        owner1.setCity("city 1");
        owner1.setAddress("address 1");
        owner1.setTelephone("111");

        Pet dogOwner1=new Pet();
        dogOwner1.setName("dogOwner1");
        dogOwner1.setOwner(owner1);
        dogOwner1.setType(dog);
        dogOwner1.setBirthDate(LocalDate.now());

        owner1.getPets().add(dogOwner1);

        // Owner 2
        Owner owner2 = new Owner();
        owner2.setFirstName("owner2_First");
        owner2.setLastName("owner2_Second");
        owner2.setCity("city 2");
        owner2.setAddress("address 2");
        owner2.setTelephone("222");

        Pet dogOwner2=new Pet();
        dogOwner2.setName("dogOwner2");
        dogOwner2.setOwner(owner2);
        dogOwner2.setType(dog);
        dogOwner2.setBirthDate(LocalDate.now());

        owner2.getPets().add(dogOwner2);

        // Save Owners
        ownerService.save(owner1);
        ownerService.save(owner2);
        System.out.println("Loaded Owners ...");

        // Specialties
        Specialty radiology=new Specialty();
        radiology.setDescription("radiology");

        Specialty surgery=new Specialty();
        surgery.setDescription("surgery");

        Specialty dentistry=new Specialty();
        dentistry.setDescription("dentistry");

        specialtyService.save(radiology);
        specialtyService.save(surgery);
        specialtyService.save(dentistry);

        // Vets
        Vet vet1 = new Vet();
        vet1.setFirstName("vet1_First");
        vet1.setLastName("vet1_Second");
        vet1.getSpecialties().add(radiology);
        vet1.getSpecialties().add(surgery);

        Vet vet2 = new Vet();
        vet2.setFirstName("vet2_First");
        vet2.setLastName("vet2_Second");
        vet2.getSpecialties().add(dentistry);

        // Save Vets
        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets ...");


        // Visits
        Visit visit1=new Visit();
        visit1.setPet(dogOwner1);
        visit1.setDescription("it's good");
        visit1.setDate(LocalDate.now());

        visitService.save(visit1);
        System.out.println("Loaded Visits ...");

    }
}
