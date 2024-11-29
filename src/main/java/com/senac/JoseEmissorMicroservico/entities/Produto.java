package com.senac.JoseEmissorMicroservico.entities;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="produto")
public class Produto  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdProduto",nullable = false)
    private int id;

    @Column(name = "nomeProduto")
    private String nome;

    @Column(name = "preco")
    private String preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
