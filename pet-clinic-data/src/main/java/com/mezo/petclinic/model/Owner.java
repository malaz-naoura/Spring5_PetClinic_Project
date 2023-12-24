package com.mezo.petclinic.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Owner extends Person{
    private String address;

    private String city;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    @Setter(AccessLevel.NONE)
    private Set<Pet> pets=new HashSet<>();

    public void addPet(Pet newElement) {
        this.pets.add(newElement);
    }
}
