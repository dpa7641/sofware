package com.teachme.repo;

import com.teachme.model.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autor miguel Corma
 */
public interface IPermisoRepo extends JpaRepository<Permiso,Long> {
}
