package com.mezo.petclinic.model;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@Data
@MappedSuperclass
public class Person extends BaseEntity{
    private String firstName;

    private String lastName;

}
