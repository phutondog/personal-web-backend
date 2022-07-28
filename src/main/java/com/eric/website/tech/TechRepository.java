package com.eric.website.tech;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TechRepository extends CrudRepository<Tech, String> {
    @Query(value = "SELECT * FROM techs", nativeQuery = true)
    Optional<List<Tech>> getAllTech();

}
