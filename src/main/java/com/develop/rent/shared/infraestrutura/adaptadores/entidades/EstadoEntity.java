package com.develop.rent.shared.infraestrutura.adaptadores.entidades;

import com.develop.rent.shared.dominio.Estado;
import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 2)
    private String sigla;

    public EstadoEntity() {}

    public EstadoEntity(Estado estado) {
        this.nome = estado.getNome();
        this.sigla = estado.getSigla();
    }

    public Estado toEstado(){
        return new Estado(this.id, this.nome, this.sigla);
    }
}
