package com.teachme.teachme.model;

import javax.persistence.*;

/**
 * @autor miguel Corma
 */
@Entity
@Table(name = "docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocente;

    @Column(name ="nombre",nullable = false,length = 30)
    private  String nombre;

    @Column(name = "apPaterno", nullable = false,length = 30)
    private  String apPaterno;

    @Column(name="apMateria",nullable = false,length = 30)
    private String apMaterno;

    @Column(name = "codSis", nullable = false, length = 10)
    private String codSis;

    @Column(name = "cedula", nullable = false, length = 10)
    private String cedula;

    @Column(name = "celular", nullable = false, length = 10)
    private String celular;

    @Column(name = "email", nullable = false, length = 50)
    private String email;
}
