package com.teachme.teachme.service.imple;

import com.teachme.teachme.model.Usuario;
import com.teachme.teachme.repo.IUsuarioRepo;
import com.teachme.teachme.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor miguel Corma
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepo repo;

    @Override
    public Usuario registrar(Usuario u) {
        Usuario usu=null;
        //if(buscarCi(u.getCi()))
        return repo.save(u);
    }

    @Override
    public Usuario modificar(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public Usuario leer(Long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminar(Long id) {

        repo.deleteById(id);

    }

}
