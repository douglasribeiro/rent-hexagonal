package com.develop.rent.shared.infraestrutura.adaptadores.entidades;

import com.develop.rent.shared.dominio.Cidade;
import com.develop.rent.shared.dominio.Estado;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "cidade")
public class CidadeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 70)
    @NonNull
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private EstadoEntity estadoEntity;

    public CidadeEntity() {}

    public CidadeEntity(Cidade cidade) {
        this.nome = cidade.getNome();
        this.estadoEntity = new EstadoEntity(cidade.getEstado());
    }

    public Cidade toCidade(){
        return new Cidade(this.id, this.nome, this.estadoEntity.toEstado());
    }




}
