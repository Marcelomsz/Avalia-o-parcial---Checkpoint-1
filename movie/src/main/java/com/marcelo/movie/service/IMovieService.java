package com.marcelo.movie.service;

import com.marcelo.movie.dto.MovieDTO;
import com.marcelo.movie.entity.MovieEntity;

import java.util.List;

public interface IMovieService {
    void save(MovieDTO dto);
    List<MovieEntity> findByGenre(String genre);
}
