package com.eric.website.projecttech;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ProjectTechID implements Serializable {

    @Column(name = "projectID", nullable = false)
    private String projectID;

    @Column(name = "techID", nullable = false)
    private String techID;


    public ProjectTechID(){

    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getTechID() {
        return techID;
    }

    public void setTechID(String techID) {
        this.techID = techID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectTechID)) return false;

        ProjectTechID that = (ProjectTechID) o;

        if (!projectID.equals(that.projectID)) return false;
        return techID.equals(that.techID);
    }

    @Override
    public int hashCode() {
        int result = projectID.hashCode();
        result = 31 * result + techID.hashCode();
        return result;
    }
}
