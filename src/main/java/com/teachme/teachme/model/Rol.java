package com.teachme.teachme.model;

import javax.persistence.*;

/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @OneToOne
    @JoinColumn(name="usuario_ID")
    private Usuario usuario;

    @Column(name = "descripcion",nullable = false)
    private String descripcion;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
