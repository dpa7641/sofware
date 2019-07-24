package com.teachme.teachme.repo;

import com.teachme.teachme.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @autor miguel Corma
 */
public interface IEstudianteRepo extends JpaRepository<Estudiante,Long> {

}
