package com.teachme.repo;

import com.teachme.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autor miguel Corma
 */
public interface IUsuarioRepo extends JpaRepository<Usuario,Long> {

    Usuario findByCi(String ci);
}
