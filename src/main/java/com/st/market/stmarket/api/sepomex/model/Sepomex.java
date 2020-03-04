package com.st.market.stmarket.api.sepomex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janez
 */
@Entity
@Table(name = "sepomex", catalog = "dbmaster")
public class Sepomex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "d_codigo")
    private Long d_codigo;

    @Column(name = "d_asenta")
    private String d_asenta;

    @Column(name = "d_tipo_asenta")
    private String d_tipo_asenta;

    @Column(name = "d_mnpio")
    private String d_mnpio;

    @Column(name = "d_estado")
    private String d_estado;

    @Column(name = "d_ciudad")
    private String d_ciudad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getD_codigo() {
        return d_codigo;
    }

    public void setD_codigo(Long d_codigo) {
        this.d_codigo = d_codigo;
    }

    public String getD_asenta() {
        return d_asenta;
    }

    public void setD_asenta(String d_asenta) {
        this.d_asenta = d_asenta;
    }

    public String getD_tipo_asenta() {
        return d_tipo_asenta;
    }

    public void setD_tipo_asenta(String d_tipo_asenta) {
        this.d_tipo_asenta = d_tipo_asenta;
    }

    public String getD_mnpio() {
        return d_mnpio;
    }

    public void setD_mnpio(String d_mnpio) {
        this.d_mnpio = d_mnpio;
    }

    public String getD_estado() {
        return d_estado;
    }

    public void setD_estado(String d_estado) {
        this.d_estado = d_estado;
    }

    public String getD_ciudad() {
        return d_ciudad;
    }

    public void setD_ciudad(String d_ciudad) {
        this.d_ciudad = d_ciudad;
    }

}
