package com.develop.rent.shared.dominio.adaptadores.services;

import com.develop.rent.shared.dominio.dto.EstadoDTO;
import com.develop.rent.shared.dominio.Estado;
import com.develop.rent.shared.dominio.portas.interfaces.EstadoServicePort;
import com.develop.rent.shared.dominio.portas.repositories.EstadoRepositoryPort;
import com.sun.jdi.LongValue;

import java.util.List;

public class EstadoServiceImp implements EstadoServicePort {

    private final EstadoRepositoryPort estadoRepository;

    public EstadoServiceImp(EstadoRepositoryPort estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public List<EstadoDTO> getEstados() {
        return estadoRepository.findAll().stream().map(Estado::toEstadoDTO).toList();
    }

    @Override
    public EstadoDTO getEstado(Long id) {
        return estadoRepository.findById(id).toEstadoDTO();
    }

    @Override
    public EstadoDTO createEstado(EstadoDTO estadoDTO) {
        return estadoRepository.save(new Estado(estadoDTO)).toEstadoDTO();
    }

    @Override
    public EstadoDTO updateEstado(Long id,EstadoDTO estadoDTO) {
        Estado estado = estadoRepository.findById(id);
        estado.atualizarEstado(estadoDTO);
        return estadoRepository.save(estado).toEstadoDTO();
    }

    @Override
    public void deleteEstado(Long id) {
        estadoRepository.delete(estadoRepository.findById(id));
    }
}
