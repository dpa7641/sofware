package com.teachme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "permiso")
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermiso;

    @Column(name = "dPermiso",nullable = false)
    private String dPermiso;

    /*@ManyToOne
    @JoinColumn(name = "FK_rol", nullable = false, updatable = false)
    private Rol rol;*/

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false)
    @JoinColumn(
            name = "ROL_ID",
            nullable = false
    )
    @JsonIgnore
    private Rol rol;

    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getdPermiso() {
        return dPermiso;
    }

    public void setdPermiso(String dPermiso) {
        this.dPermiso = dPermiso;
    }

}
