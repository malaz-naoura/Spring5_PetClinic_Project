package com.mezo.petclinic.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vet extends Person{

    @ManyToMany
    @JoinTable(name="MM_VET_SPECIALTY",
            joinColumns = @JoinColumn(name="vet_id"),inverseJoinColumns = @JoinColumn(name="specialty_id"))
    @Setter(AccessLevel.NONE)
    private Set<Specialty> specialties=new HashSet<>();

    void addSpecialty(Specialty newElement){
        this.specialties.add(newElement);
    }

}
