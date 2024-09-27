package com.develop.rent.shared.dominio.dto;

import com.develop.rent.shared.dominio.Estado;

public record CidadeDTO(
        Long id,
        String nome,
        Estado estado) {
}
