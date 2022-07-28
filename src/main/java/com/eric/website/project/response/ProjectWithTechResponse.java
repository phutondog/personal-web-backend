package com.eric.website.project.response;

import com.eric.website.projecttech.ProjectTech;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

public class ProjectWithTechResponse {

    private String id;
    private String desc;
    private String img;
    private String url;
    private List<ProjectTech> projectTeches;

    public ProjectWithTechResponse(){

    }

    public ProjectWithTechResponse(String id, String desc, String img, String url, List<ProjectTech> projectTeches) {
        this.id = id;
        this.desc = desc;
        this.img = img;
        this.url = url;
        this.projectTeches = projectTeches;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ProjectTech> getProjectTeches() {
        return projectTeches;
    }

    public void setProjectTeches(List<ProjectTech> projectTeches) {
        this.projectTeches = projectTeches;
    }
}
