package com.senac.JoseEmissorMicroservico.services;

import com.senac.JoseEmissorMicroservico.entities.Bilhete;
import com.senac.JoseEmissorMicroservico.entities.Loteria;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BilheteService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Bilhete adcionarBilhete(Bilhete bilhete){
        rabbitTemplate.convertAndSend("fila-ecommerce",bilhete);
        return bilhete;
    }
}
