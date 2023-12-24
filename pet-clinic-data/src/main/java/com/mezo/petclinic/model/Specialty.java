package com.mezo.petclinic.model;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@Entity
public class Specialty extends BaseEntity {
    private String description;
}
