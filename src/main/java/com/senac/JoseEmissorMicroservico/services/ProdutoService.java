package com.senac.JoseEmissorMicroservico.services;

import com.senac.JoseEmissorMicroservico.entities.Produto;
import com.senac.JoseEmissorMicroservico.repository.ProdutoRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    public ProdutoService(ProdutoRepository produtoRepository) {this.produtoRepository =produtoRepository;}
//
//    public List<Produto>listarTodos(){
//        return produtoRepository.findAll();
//    }
//    public Produto adcionar(Produto produto){
//        rabbitTemplate.convertAndSend("fila-produto", produto);
//        return produtoRepository.save(produto);
//    }


    public  Produto adcionar(Produto produto){
        rabbitTemplate.convertAndSend("fila-ecommerce",produto);
        return produto;
    }




}
