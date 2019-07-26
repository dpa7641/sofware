package com.teachme.teachme.repo;

import com.teachme.teachme.model.Usuario;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
/**
 * @autor miguel Corma
 */
public interface IUsuarioRepo extends CrudRepository<Usuario,Long> {

}
