package com.develop.rent.shared.dominio;

import com.develop.rent.shared.dominio.dto.CidadeDTO;

public class Cidade {

    private Long id;
    private String nome;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Long id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade(CidadeDTO cidadeDTO) {
        this.id = cidadeDTO.id();
        this.nome = cidadeDTO.nome();
        this.estado = cidadeDTO.estado();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public CidadeDTO toCidadeDTO() {
        return new CidadeDTO(this.id, this.nome, this.estado);
    }

    public void atualizaCidade(CidadeDTO cidadeDTO) {
        this.nome = cidadeDTO.nome();
        this.estado = cidadeDTO.estado();
    }
}