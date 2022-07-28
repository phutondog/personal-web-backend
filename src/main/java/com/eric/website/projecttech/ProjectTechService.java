package com.eric.website.projecttech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectTechService {

    private final ProjectTechRepository projectTechRepository;

    @Autowired
    public ProjectTechService(ProjectTechRepository projectTechRepository) {
        this.projectTechRepository = projectTechRepository;
    }

    public Optional<ProjectTechID> getAllProjTech(){
        return projectTechRepository.getAllProjTech();
    }

    public List<ProjectTech> getAllProjTech(String projID) {
        return projectTechRepository.getAllTechOfProj(projID);
    }

}
