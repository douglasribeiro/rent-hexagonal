package com.develop.rent.shared.infraestrutura.adaptadores.repositories;

import com.develop.rent.shared.dominio.Estado;
import com.develop.rent.shared.dominio.portas.repositories.EstadoRepositoryPort;
import com.develop.rent.shared.infraestrutura.adaptadores.entidades.EstadoEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EstadoRepository implements EstadoRepositoryPort {

    private final SpringEstadoRepository estadoRepository;

    public EstadoRepository(SpringEstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public List<Estado> findAll() {
        List<EstadoEntity> estadoEntities = this.estadoRepository.findAll();
        return estadoEntities.stream().map(EstadoEntity::toEstado).collect(Collectors.toList());
    }

    @Override
    public Estado findById(Long id) {
        return this.estadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Estado nao encontrado")).toEstado();
    }

    @Override
    public Estado save(Estado estado) {
        return this.estadoRepository.save(new EstadoEntity(estado)).toEstado();
    }

    @Override
    public void delete(Estado estado) {
        this.estadoRepository.delete(new EstadoEntity(estado));
    }
}
