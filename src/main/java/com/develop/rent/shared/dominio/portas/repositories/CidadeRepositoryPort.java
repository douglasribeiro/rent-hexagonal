package com.develop.rent.shared.dominio.portas.repositories;

import com.develop.rent.shared.dominio.Cidade;

import java.util.List;

public interface CidadeRepositoryPort {

    List<Cidade> findAll();

    Cidade findById(Long id);

    Cidade save(Cidade cidade);

    void delete(Cidade cidade);


}
