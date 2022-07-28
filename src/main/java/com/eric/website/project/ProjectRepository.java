package com.eric.website.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, String> {
    @Query(value = "SELECT * FROM projects", nativeQuery = true)
    Optional<Project> getAllProjects();

}
