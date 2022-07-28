package com.eric.website.about;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AboutRepository extends CrudRepository<About, String> {
    @Query(value = "SELECT * FROM abouts", nativeQuery = true)
    Optional<About> getAllAbout();

}
