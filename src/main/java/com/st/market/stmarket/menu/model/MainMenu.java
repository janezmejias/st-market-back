package com.st.market.stmarket.menu.model;

import javax.persistence.*;

@Entity
@Table(name = "MainMenu", catalog = "dbmaster")
public class MainMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @Column(name = "image")
    private String image;

    @Column(name = "need_to_auth")
    private Boolean needToAuth;

    @Column(name = "available")
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getNeedToAuth() {
        return needToAuth;
    }

    public void setNeedToAuth(Boolean needToAuth) {
        this.needToAuth = needToAuth;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
