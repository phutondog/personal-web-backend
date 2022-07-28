package com.eric.website.tech;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "techs")
public class Tech {

    @Id
    private String id;

    @Column(name = "desc")
    private String desc;

    @Column(name = "area")
    private String area;

    @Column(name = "img")
    private String img;


    public Tech(){

    }

    public Tech(String id, String desc, String area, String img) {
        this.id = id;
        this.desc = desc;
        this.area = area;
        this.img = img;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
