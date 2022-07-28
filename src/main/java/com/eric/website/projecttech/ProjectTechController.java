package com.eric.website.projecttech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projtechs")
public class ProjectTechController {

    private final ProjectTechService projectTechService;

    @Autowired
    public ProjectTechController(ProjectTechService projectTechService) {
        this.projectTechService = projectTechService;
    }


    @GetMapping(value = "")
    public @ResponseBody Optional<ProjectTechID> getAllProjTech(){
        return projectTechService.getAllProjTech();
    }

    @GetMapping(value="/{projID}")
    public @ResponseBody List<ProjectTech> getAllProjTechs(@PathVariable String projID){
        return projectTechService.getAllProjTech(projID);
    }

}
