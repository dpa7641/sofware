package com.teachme.teachme.controller;

import com.teachme.teachme.model.Estudiante;
import com.teachme.teachme.service.imple.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autor miguel Corma
 */
@RequestMapping(value = "/estudiantes")
@RestController



public class EstudianteController {

    @Autowired
    private EstudianteServiceImpl service;

    @PostMapping
    public ResponseEntity registrar(@RequestBody Estudiante estudiante){
        Estudiante e= service.registrar(estudiante);

        if(e != null){
            return new ResponseEntity(e, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Estudiante ya Existe", HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping
    public Estudiante modificar(@RequestBody Estudiante estudiante){
        return service.modificar(estudiante);
    }

    @GetMapping
    public List<Estudiante> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Estudiante leer(@PathVariable("id") Long id){
        return service.leer(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        service.eliminar(id);
    }

}
