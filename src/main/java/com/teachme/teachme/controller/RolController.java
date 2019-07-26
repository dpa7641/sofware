package com.teachme.teachme.controller;

import com.teachme.teachme.model.Rol;
import com.teachme.teachme.model.Usuario;
import com.teachme.teachme.service.imple.RolServiceImpl;
import com.teachme.teachme.service.imple.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autor miguel Corma
 */

@RequestMapping(value = "/roles")
@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class RolController {

    @Autowired
    private RolServiceImpl service;

    @PostMapping
    public ResponseEntity registrar(@RequestBody Rol rol){
        Rol e= service.registrar(rol);

        if(e != null){
            return new ResponseEntity(e, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Usuario ya Existe", HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping
    public Rol modificar(@RequestBody Rol rol){
        return service.modificar(rol);
    }

    @GetMapping
    public List<Rol> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Rol leer(@PathVariable("id") Long id){
        return service.leer(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        service.eliminar(id);
    }

}
