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

    @GetMapping(value = "listarProdutos")
    public ResponseEntity<List<Produto>> ListarProdutos(){
        List<Produto> produtos = produtoService.listarTodos();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping(value = "adProduto")
    public ResponseEntity<Produto>AdcionarProduto(@RequestBody Produto produto){
        Produto tempProduto = produtoService.adcionar(produto);
        return ResponseEntity.ok(tempProduto);
    }

}
