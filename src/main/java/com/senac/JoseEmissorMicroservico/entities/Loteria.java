package com.senac.JoseEmissorMicroservico.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "loteria")
public class Loteria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    // Construtores, getters e setters
    public Loteria() {
    }

    public Loteria(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
