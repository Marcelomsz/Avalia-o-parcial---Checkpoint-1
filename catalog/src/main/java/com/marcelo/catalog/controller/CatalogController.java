package com.marcelo.catalog.controller;

import com.marcelo.catalog.response.MovieResponse;
import com.marcelo.catalog.service.impl.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl service;

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieResponse>> findByGenre(@PathVariable String genre){
        List<MovieResponse> movieResponses = service.findMoviesByGenre(genre);
        if (!movieResponses.isEmpty()){
            return ResponseEntity.ok(movieResponses);
        }
        return ResponseEntity.noContent().build();
    }
}
