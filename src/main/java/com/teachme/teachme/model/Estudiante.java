package com.teachme.teachme.model;

import javax.persistence.*;

/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;

    @Column(name = "apPaterno", nullable = false, length = 30)
    private String apPaterno;

    @Column(name = "apMaterno", nullable = false, length = 30)
    private String apMaterno;

    @Column(name = "codSis", nullable = false, length = 10)
    private String codSis;

    @Column(name = "cedula", nullable = false, length = 10)
    private String cedula;

    @Column(name = "celular", nullable = false, length = 10)
    private String celular;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "contrasenia", nullable = false, length = 30)
    private String contrasenia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCodSis() {
        return codSis;
    }

    public void setCodSis(String codSis) {
        this.codSis = codSis;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
