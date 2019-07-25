package com.teachme.teachme.service.imple;

import com.teachme.teachme.model.Rol;
import com.teachme.teachme.repo.IRolRepo;
import com.teachme.teachme.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor miguel Corma
 */
@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolRepo repo;

    @Override
    public Rol registrar(Rol rol) {

        return repo.save(rol);
    }

    @Override
    public Rol modificar(Rol rol) {
        return repo.save(rol);
    }

    @Override
    public Rol leer(Long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Rol> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Long id) {

        repo.deleteById(id);

    }
}
