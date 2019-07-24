package com.teachme.teachme.service.imple;

import com.teachme.teachme.model.Estudiante;
import com.teachme.teachme.repo.IEstudianteRepo;
import com.teachme.teachme.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor miguel Corma
 */
@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteRepo repo;

    @Override
    public Estudiante registrar(Estudiante estudiante) {

        return repo.save(estudiante);
    }

    @Override
    public Estudiante modificar(Estudiante estudiante) {
        return repo.save(estudiante);
    }

    @Override
    public Estudiante leer(Long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Long id) {

        repo.deleteById(id);

    }

}
