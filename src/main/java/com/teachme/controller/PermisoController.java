package com.teachme.controller;

import com.teachme.model.Permiso;
import com.teachme.service.imple.PermisoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @autor miguel Corma
 */
@RequestMapping(value = "/permisos")
@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class PermisoController {

    @Autowired
    private PermisoServiceImpl service;

    @PostMapping
    public ResponseEntity registrar(@RequestBody Permiso permiso){
        Permiso p= service.registrar(permiso);

        if(p != null){
            return new ResponseEntity(p, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Usuario ya Existe", HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping
    public Permiso modificar(@RequestBody Permiso permiso){
        return service.modificar(permiso);
    }

    @GetMapping
    public List<Permiso> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Permiso leer(@PathVariable("id") Long id){
        return service.leer(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        service.eliminar(id);
    }

}


