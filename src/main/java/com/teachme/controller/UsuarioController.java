package com.teachme.controller;

import com.teachme.model.Usuario;
import com.teachme.service.imple.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @autor miguel Corma
 */
@RequestMapping(value = "/usuarios")
@RestController

@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl service;

    @PostMapping
    public ResponseEntity registrar(@RequestBody Usuario usuario){
        Usuario e= service.registrar(usuario);

        if(e != null){
            return new ResponseEntity(e, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity("Usuario ya Existe", HttpStatus.OK);
        }
    }

    @PutMapping
    public Usuario modificar(@RequestBody Usuario usuario){
        return service.modificar(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Usuario leer(@PathVariable("id") Long id){
        return service.leer(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        service.eliminar(id);
    }

}

