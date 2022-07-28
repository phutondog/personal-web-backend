package com.eric.website.projecttech;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectTechRepository extends CrudRepository<ProjectTech, String> {
    @Query(value = "SELECT * FROM projtech", nativeQuery = true)
    Optional<ProjectTechID> getAllProjTech();

    @Query(value = "SELECT * FROM projtech WHERE projID = ?1", nativeQuery = true)
    List<ProjectTech> getAllTechOfProj(String projID);

}
