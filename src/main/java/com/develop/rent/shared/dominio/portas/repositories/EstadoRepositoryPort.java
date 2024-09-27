package com.develop.rent.shared.dominio.portas.repositories;

import com.develop.rent.shared.dominio.Estado;

import java.util.List;

public interface EstadoRepositoryPort {

    List<Estado> findAll();

    Estado findById(Long id);

    Estado save(Estado estado);

    void delete(Estado estado);
}
