package com.eric.website.projecttech;

import com.eric.website.project.Project;
import com.eric.website.tech.Tech;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "projtech")
public class ProjectTech {

    @EmbeddedId
    private ProjectTechID projectTechID;

    @ManyToOne
    @JoinColumn(name = "projectID", referencedColumnName = "id", insertable = false, updatable = false)
    private Project projectID;

    @ManyToOne
    @JoinColumn(name = "techID", referencedColumnName = "id", insertable = false, updatable = false)
    @JsonIgnore
    private Tech techID;


    public ProjectTech(){

    }

    public ProjectTech(ProjectTechID projectTechID, Project projectID, Tech techID) {
        this.projectTechID = projectTechID;
        this.projectID = projectID;
        this.techID = techID;
    }

    public ProjectTechID getProjectTechID() {
        return projectTechID;
    }

    public void setProjectTechID(ProjectTechID projectTechID) {
        this.projectTechID = projectTechID;
    }

    public Project getProjectID() {
        return projectID;
    }

    public void setProjectID(Project projectID) {
        this.projectID = projectID;
    }

    public Tech getTechID() {
        return techID;
    }

    public void setTechID(Tech techID) {
        this.techID = techID;
    }
}
