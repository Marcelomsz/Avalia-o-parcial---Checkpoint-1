package com.marcelo.catalog.service;

import com.marcelo.catalog.response.MovieResponse;
import java.util.List;

public interface ICatalogService {
    List<MovieResponse> findMoviesByGenre(String genre);
}