package com.mezo.petclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Visit extends BaseEntity{

    private LocalDate date;

    private String description;

    @ManyToOne
    private Pet pet;

}
