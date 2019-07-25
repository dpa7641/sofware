package com.teachme.teachme.repo;

import com.teachme.teachme.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @autor miguel Corma
 */
public interface IUsuarioRepo extends JpaRepository<Usuario,Long> {

}
