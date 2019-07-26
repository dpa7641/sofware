package com.teachme.teachme.service.imple;

import com.teachme.teachme.model.Administrador;
import com.teachme.teachme.repo.IAdministradorRepo;
import com.teachme.teachme.repo.IUsuarioRepo;
import com.teachme.teachme.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor miguel Corma
 */
@Service
public class AdministradorImpl implements IAdministradorService {

    @Autowired
    private IAdministradorRepo repo;

    @Override
    public Administrador registrar(Administrador administrador) {

        return repo.save(administrador);
    }

    @Override
    public Administrador modificar(Administrador administrador) {
        return repo.save(administrador);
    }

    @Override
    public Administrador leer(Long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Administrador> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Long id) {

        repo.deleteById(id);

    }
}
