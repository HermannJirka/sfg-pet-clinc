package cz.spring.guru.service;

import cz.spring.guru.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findBy(Long id);

    Owner save(Owner Owner);

    Set<Owner> findAll();
}
