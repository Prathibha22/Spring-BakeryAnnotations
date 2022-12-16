package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BakerRepository extends CrudRepository<Baker, Long> {
    public Optional<Baker> findById(Long id);
}
