package com.marcelo.movie.service.impl;

import com.marcelo.movie.dto.MovieDTO;
import com.marcelo.movie.entity.MovieEntity;
import com.marcelo.movie.feign.CatalogFeign;
import com.marcelo.movie.repository.MovieRepository;
import com.marcelo.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieServiceImpl implements MovieService {

    @Autowired
    private CatalogFeign catalogFeign;

    @Autowired
    private MovieRepository repository;

    @Override
    public void save(MovieDTO dto) {
        MovieEntity movie = new MovieEntity();
        movie.setName(dto.getName());
        movie.setGenre(dto.getGenre());
        movie.setUrlStream(dto.getUrlStream());
        repository.save(movie);
    }

    @Override
    public MovieEntity findByGenre(String genre) {
        var MovieEntity= repository.findByGenre(genre);
        return MovieEntity;
    }
}
