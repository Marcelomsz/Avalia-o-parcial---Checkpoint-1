package com.marcelo.catalog.service.impl;

import com.marcelo.catalog.dto.CatalogDTO;
import com.marcelo.catalog.entity.CatalogEntity;
import com.marcelo.catalog.feign.MovieFeign;
import com.marcelo.catalog.repository.CatalogRepository;
import com.marcelo.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private CatalogRepository repository;

    @Autowired
    private MovieFeign movie;

    @Override
    public void save(CatalogDTO catalogDTO) {
        CatalogEntity catalog = new CatalogEntity();
        catalog.setNome(catalogDTO.getNome());
        repository.save(catalog);
    }

    @Override
    public Long findByName(String nome) {
        var catalog = repository.findByName(nome);
        return catalog.getId();
    }

    @Override
    public String findMovieByName(String name) {
        var catalog = repository.findByName(name);
        return movie.findName(catalog.getId());

    }
}