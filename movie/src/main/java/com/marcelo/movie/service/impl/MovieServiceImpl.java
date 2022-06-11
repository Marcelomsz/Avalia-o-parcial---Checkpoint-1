package com.marcelo.movie.service.impl;

import com.marcelo.movie.dto.MovieDTO;
import com.marcelo.movie.entity.MovieEntity;
import com.marcelo.movie.repository.MovieRepository;
import com.marcelo.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

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
    public List<MovieEntity> findByGenre(String genre) {
        List<MovieEntity> movies= repository.findByGenre(genre);
        return movies;
    }
}
