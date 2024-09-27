package com.develop.rent.shared.dominio.adaptadores.services;

import com.develop.rent.shared.dominio.Cidade;
import com.develop.rent.shared.dominio.dto.CidadeDTO;
import com.develop.rent.shared.dominio.portas.interfaces.CidadeServicePort;
import com.develop.rent.shared.dominio.portas.repositories.CidadeRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class CidadeServiceImp  implements CidadeServicePort {

    private final CidadeRepositoryPort cidadeRepository;

    public CidadeServiceImp(CidadeRepositoryPort cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @Override
    public List<CidadeDTO> getCidades() {
        return this.cidadeRepository.findAll().stream().map(Cidade::toCidadeDTO).collect(Collectors.toList());
    }

    @Override
    public CidadeDTO getCidade(Long id) {
        return cidadeRepository.findById(id).toCidadeDTO();
    }

    @Override
    public CidadeDTO createCidade(CidadeDTO cidadeDTO) {
        return cidadeRepository.save(new Cidade(cidadeDTO)).toCidadeDTO();
    }

    @Override
    public CidadeDTO updateCidade(Long id, CidadeDTO cidadeDTO) {
        Cidade cidade = cidadeRepository.findById(id);
        cidade.atualizaCidade(cidadeDTO);
        return cidadeRepository.save(cidade).toCidadeDTO();
    }

    @Override
    public void deleteCidade(Long id) {
        cidadeRepository.delete(cidadeRepository.findById(id));
    }



}
