package com.senac.JoseEmissorMicroservico.services;

import com.senac.JoseEmissorMicroservico.entities.Loteria;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoteriaService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Loteria adcionarLoteria(Loteria loteria){
        rabbitTemplate.convertAndSend("fila-ecommerce",loteria);
        return loteria;
    }
}
