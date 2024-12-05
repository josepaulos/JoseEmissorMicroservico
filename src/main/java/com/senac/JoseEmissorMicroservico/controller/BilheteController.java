package com.senac.JoseEmissorMicroservico.controller;
import com.senac.JoseEmissorMicroservico.entities.Bilhete;
import com.senac.JoseEmissorMicroservico.services.BilheteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BilheteController {

    private BilheteService bilheteService;

    public BilheteController (BilheteService bilheteService){this.bilheteService=bilheteService;}

    @PostMapping(value = "adBilhete")
    public ResponseEntity<Bilhete> adcionarBilhete(@RequestBody Bilhete bilhete){
        Bilhete tempBilhete = bilheteService.adcionarBilhete(bilhete);
        return ResponseEntity.ok(tempBilhete);
    }
}
