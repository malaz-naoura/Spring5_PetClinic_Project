package com.mezo.petclinic.model;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity
public class PetType extends BaseEntity{
    private String name;
}
