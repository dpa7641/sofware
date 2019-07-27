package com.teachme.model;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "descripcionRol", nullable = false)
    private String descripcionRol;

    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;


    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }
}
