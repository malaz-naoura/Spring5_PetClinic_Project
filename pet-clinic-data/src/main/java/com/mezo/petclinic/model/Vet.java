package com.mezo.petclinic.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Vet extends Person{

    @ManyToMany
    @JoinTable(name="MM_VET_SPECIALTY",
            joinColumns = @JoinColumn(name="vet_id"),inverseJoinColumns = @JoinColumn(name="specialty_id"))
    private Set<Specialty> specialties=new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
