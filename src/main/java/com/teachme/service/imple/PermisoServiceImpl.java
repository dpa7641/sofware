package com.teachme.service.imple;

import com.teachme.model.Permiso;
import com.teachme.repo.IPermisoRepo;
import com.teachme.service.IPermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor miguel Corma
 */
@Service
public class PermisoServiceImpl implements IPermisoService {
    @Autowired
    private IPermisoRepo repo;

    @Override
    public Permiso registrar(Permiso permiso) {
        return repo.save(permiso);
    }

    @Override
    public Permiso modificar(Permiso permiso) {
        return repo.save(permiso);
    }

    @Override
    public Permiso leer(Long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Permiso> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Long id) {

        repo.deleteById(id);

    }
}
