package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepo extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
