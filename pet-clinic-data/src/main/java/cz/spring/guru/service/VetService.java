package cz.spring.guru.service;

import cz.spring.guru.model.Pet;
import cz.spring.guru.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBy(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
