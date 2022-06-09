package com.marcelo.movie.service;

import com.marcelo.movie.dto.MovieDTO;
import com.marcelo.movie.entity.MovieEntity;

public interface MovieService {
    void save(MovieDTO dto);
    MovieEntity findByGenre(String genre);
}
