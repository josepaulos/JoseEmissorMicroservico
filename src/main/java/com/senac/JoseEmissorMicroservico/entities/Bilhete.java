package com.senac.JoseEmissorMicroservico.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bilhete")
public class Bilhete implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "loteria_id", nullable = false)
    private Loteria loteria;

    // Construtores, getters e setters
    public Bilhete() {
    }

    public Bilhete(String numero, Loteria loteria) {
        this.numero = numero;
        this.loteria = loteria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Loteria getLoteria() {
        return loteria;
    }

    public void setLoteria(Loteria loteria) {
        this.loteria = loteria;
    }
}
