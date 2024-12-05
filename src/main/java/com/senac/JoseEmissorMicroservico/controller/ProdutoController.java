package com.senac.JoseEmissorMicroservico.controller;

import com.senac.JoseEmissorMicroservico.entities.Produto;
import com.senac.JoseEmissorMicroservico.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){this.produtoService=produtoService;}


    @PostMapping(value = "adProduto")
    public ResponseEntity<Produto>AdcionarProduto(@RequestBody Produto produto){
        Produto tempProduto = produtoService.adcionar(produto);
        return ResponseEntity.ok(tempProduto);
    }

}
