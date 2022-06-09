package com.marcelo.catalog.service;

import com.marcelo.catalog.dto.CatalogDTO;

public interface CatalogService {
    void save(CatalogDTO catalogDTO);
    Long findByName(String nome);
    String findMovieByName(String nome);
}