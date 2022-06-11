package com.marcelo.catalog.service.impl;

import com.marcelo.catalog.service.MovieFeign;
import com.marcelo.catalog.response.MovieResponse;
import com.marcelo.catalog.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements ICatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<MovieResponse> findMoviesByGenre(String genre) {
        return movieFeign.findMovies(genre);
    }
}