package com.senac.JoseEmissorMicroservico.controller;

import com.senac.JoseEmissorMicroservico.entities.Loteria;
import com.senac.JoseEmissorMicroservico.services.LoteriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoteriaController {

    private final LoteriaService loteriaService;

    public LoteriaController(LoteriaService loteriaService) {
        this.loteriaService = loteriaService;
    }

    @PostMapping(value = "adLoteria")
    public ResponseEntity<Loteria> adcionarLoteria(@RequestBody Loteria loteria) {
        Loteria tempLoteria = loteriaService.adcionarLoteria(loteria);
        return ResponseEntity.ok(tempLoteria);
    }
}
