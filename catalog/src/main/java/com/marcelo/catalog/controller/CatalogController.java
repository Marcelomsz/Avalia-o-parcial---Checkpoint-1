package com.marcelo.catalog.controller;

import com.marcelo.catalog.dto.CatalogDTO;
import com.marcelo.catalog.service.impl.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl service;

    @PostMapping()
    public ResponseEntity<Void> save(@RequestBody() CatalogDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{nome}")
    public Long findByNome(@PathVariable String nome){
        return service.findByName(nome);
    }

    @GetMapping("/jogos/{nome}")
    public String findJogosByNome(@PathVariable String nome){
        return service.findMovieByName(nome);
    }
}
