package com.mezo.petclinic.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"owner"})
@Entity
public class Pet extends BaseEntity {
    private String name;

    private LocalDate birthDate;

    @ManyToOne
    private PetType type;

    @ManyToOne
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    @Setter(AccessLevel.NONE)
    private Set<Visit> visits = new HashSet<>();

    void addVisit(Visit newElement) {
        this.visits.add(newElement);
    }

}
