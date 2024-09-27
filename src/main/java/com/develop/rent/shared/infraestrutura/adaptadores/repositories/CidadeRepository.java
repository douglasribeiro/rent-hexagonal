package com.develop.rent.shared.infraestrutura.adaptadores.repositories;

import com.develop.rent.shared.dominio.Cidade;
import com.develop.rent.shared.dominio.portas.repositories.CidadeRepositoryPort;
import com.develop.rent.shared.infraestrutura.adaptadores.entidades.CidadeEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CidadeRepository implements CidadeRepositoryPort {

    private final SpringCidadeRepository cidadeRepository;

    public CidadeRepository(SpringCidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @Override
    public List<Cidade> findAll() {
        List<CidadeEntity> cidadeEntities = this.cidadeRepository.findAll();
        return cidadeEntities.stream().map(CidadeEntity::toCidade).collect(Collectors.toList());
    }

    @Override
    public Cidade findById(Long id) {
        return this.cidadeRepository.findById(id).orElseThrow(() -> new RuntimeException("Cidade não encontrada.")).toCidade();
    }

    @Override
    public Cidade save(Cidade cidade) {
        return this.cidadeRepository.save(new CidadeEntity(cidade)).toCidade();
    }

    @Override
    public void delete(Cidade cidade) {
        this.cidadeRepository.deleteById(cidade.getId());
    }
}
