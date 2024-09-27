package com.develop.rent.shared.dominio.portas.interfaces;

import com.develop.rent.shared.dominio.dto.EstadoDTO;

import java.util.List;

public interface EstadoServicePort {

    List<EstadoDTO> getEstados();

    EstadoDTO getEstado(Long id);

    EstadoDTO createEstado(EstadoDTO estadoDTO);

    EstadoDTO updateEstado(Long id, EstadoDTO estadoDTO);

    void deleteEstado(Long id);
}
