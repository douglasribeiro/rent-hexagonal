package com.develop.rent.shared.dominio;

import com.develop.rent.shared.dominio.dto.EstadoDTO;

public class Estado {

    private Long id;
    private String nome;
    private String sigla;

    public Estado() {}

    public Estado(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Estado(EstadoDTO estadoDTO) {
        this.id = estadoDTO.id();
        this.nome = estadoDTO.nome();
        this.sigla = estadoDTO.sigla();
    }

    public EstadoDTO toEstadoDTO(){
        return new EstadoDTO(this.id, this.nome, this.sigla);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void atualizarEstado(EstadoDTO estadoDTO) {
        this.nome = estadoDTO.nome();
        this.sigla = estadoDTO.sigla();
    }
}
