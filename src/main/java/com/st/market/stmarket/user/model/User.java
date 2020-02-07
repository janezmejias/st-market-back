package com.st.market.stmarket.user.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author janez
 */
@Entity
@Table(name = "User", catalog = "dbmaster")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;            

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "complete_name")
    private String completeName;

    @Column(name = "email")
    private String email;

    @Column(name = "photo_url", length = 1024)
    private String photoUrl;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;

    @CreationTimestamp
    @Column(name = "last_sign")
    private Timestamp lastSign;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getLastSign() {
        return lastSign;
    }

    public void setLastSign(Timestamp lastSign) {
        this.lastSign = lastSign;
    }

}
