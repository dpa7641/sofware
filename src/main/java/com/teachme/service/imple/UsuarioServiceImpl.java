package com.teachme.service.imple;

import com.teachme.model.Usuario;
import com.teachme.repo.IUsuarioRepo;
import com.teachme.service.IUsuarioService;
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
        if(buscarCi(u.getCi())==null)
        {
            return  usu=repo.save(u);
        }
        return  usu;
    }

    private Usuario buscarCi(String ci) {
        Usuario u=repo.findByCi(ci);
        return u;
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
