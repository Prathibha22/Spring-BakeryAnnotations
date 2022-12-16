package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Muffin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MuffinRepository extends CrudRepository<Muffin, Long> {
    public Optional<Muffin> findById(Long id);
}
