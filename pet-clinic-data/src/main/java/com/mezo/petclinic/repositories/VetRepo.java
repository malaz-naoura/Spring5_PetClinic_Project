package com.mezo.petclinic.repositories;

import com.mezo.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepo extends CrudRepository<Vet, Long> {
}
