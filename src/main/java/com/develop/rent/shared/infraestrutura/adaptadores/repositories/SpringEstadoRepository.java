package com.develop.rent.shared.infraestrutura.adaptadores.repositories;

import com.develop.rent.shared.dominio.Estado;
import com.develop.rent.shared.infraestrutura.adaptadores.entidades.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringEstadoRepository extends JpaRepository<EstadoEntity, Long> {
}
