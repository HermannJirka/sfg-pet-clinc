package cz.spring.guru.service;

import cz.spring.guru.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findBy(Long id);
    Pet save(Pet Pet);
    Set<Pet> findAll();
}
