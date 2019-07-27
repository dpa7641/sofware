package com.teachme.service.imple;

import com.teachme.input.UsuarioInput;
import com.teachme.model.Rol;
import com.teachme.model.Usuario;
import com.teachme.repo.IRolRepo;
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

    @Autowired
    private IRolRepo rolRepo;


    public Usuario registrar(UsuarioInput u) {
        Usuario usu= new Usuario();
        if(buscarCi(u.getCi())==null)
        {
            usu.setNombre(u.getNombre());
            usu.setApPaterno(u.getApPaterno());
            usu.setApMaterno(u.getApMaterno());
            usu.setCi(u.getCi());
            usu.setEmail(u.getEmail());
            usu.setUsuario(u.getUsuario());
            usu.setContrasenia(u.getContrasenia());
            usu.setVcontrasenia(u.getVcontrasenia());
            usu.setRol(armarRol(u.getRol()));
            repo.save(usu);
        }
        return  usu;
    }

    private Usuario buscarCi(String ci) {
        Usuario u=repo.findByCi(ci);
        if(u == null){
            u= null;
        }
        return u;
    }


    public Usuario modificar(Usuario usuario) {
        return repo.save(usuario);
    }


    public Usuario leer(Long id) {

        return repo.findById(id).orElse(null);
    }


    public List<Usuario> listar() {
        return repo.findAll();
    }


    public void eliminar(Long id) {

        repo.deleteById(id);
    }

    private Rol armarRol(Long id){

        return rolRepo.findById(id).orElse(null);
    }

}
