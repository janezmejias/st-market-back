package com.st.market.stmarket.address.model;

import javax.persistence.*;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
