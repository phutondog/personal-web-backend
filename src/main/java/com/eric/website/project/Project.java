package com.eric.website.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    private String id;

    @Column(name = "desc")
    private String desc;

    @Column(name = "img")
    private String img;

    @Column(name = "url")
    private String url;

    public Project(){

    }

    public Project(String id, String desc, String img, String url) {
        this.id = id;
        this.desc = desc;
        this.img = img;
        this.url = url;
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
}
