package com.develop.rent.shared.infraestrutura.adaptadores.repositories;

import com.develop.rent.shared.dominio.Cidade;
import com.develop.rent.shared.infraestrutura.adaptadores.entidades.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringCidadeRepository  extends JpaRepository<CidadeEntity, Long> {
}
