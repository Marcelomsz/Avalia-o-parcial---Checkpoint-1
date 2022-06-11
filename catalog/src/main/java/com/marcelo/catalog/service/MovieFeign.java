package com.marcelo.catalog.service;

import com.marcelo.catalog.response.MovieResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "MOVIE-SERVICE")
public interface MovieFeign {

    @RequestMapping(method = RequestMethod.GET, value = "movies/{genre}")
    List <MovieResponse> findMovies(@PathVariable String genre);
}
