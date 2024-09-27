package com.develop.rent.shared.dominio.portas.interfaces;

import com.develop.rent.shared.dominio.dto.CidadeDTO;

import java.util.List;

public interface CidadeServicePort {

    List<CidadeDTO> getCidades();

    CidadeDTO getCidade(Long id);

    CidadeDTO createCidade(CidadeDTO cidadeDTO);

    CidadeDTO updateCidade(Long id, CidadeDTO cidadeDTO);

    void deleteCidade(Long id);

}
