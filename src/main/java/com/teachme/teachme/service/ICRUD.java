package com.teachme.teachme.service;

import java.util.List;

/**
 * @autor miguel Corma
 */
public interface ICRUD<T> {

    T registrar(T t);
    T modificar(T t);
    T leer(Long id);
    List<T> listar();
    void eliminar(Long id);
}
