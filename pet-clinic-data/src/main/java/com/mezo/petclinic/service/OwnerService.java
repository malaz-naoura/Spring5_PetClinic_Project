package com.mezo.petclinic.service;

import com.mezo.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner save(Owner owner);

    Owner findById(Long id);

    Set<Owner> findAll();
}
