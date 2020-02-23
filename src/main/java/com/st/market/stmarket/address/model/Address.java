package com.st.market.stmarket.address.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 *
 * @author janez
 */
@Entity
@Table(name = "Address", catalog = "dbmaster")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "country")
    private String country;
    @Column(name = "state")
    private String state;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "asentamiento")
    private String asentamiento;
    @Column(name = "asentamiento_typo")
    private String asentamientoTipo;
    @Column(name = "numero_exterior")
    private String numeroExterior;
    @Column(name = "postal_code")
    private String postalCode;
    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getAsentamiento() {
        return asentamiento;
    }

    public void setAsentamiento(String asentamiento) {
        this.asentamiento = asentamiento;
    }

    public String getAsentamientoTipo() {
        return asentamientoTipo;
    }

    public void setAsentamientoTipo(String asentamientoTipo) {
        this.asentamientoTipo = asentamientoTipo;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}
