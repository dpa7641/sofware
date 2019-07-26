package com.teachme.teachme.repo;

import com.teachme.teachme.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autor miguel Corma
 */
public interface IAdministradorRepo extends JpaRepository <Administrador,Long> {
}
