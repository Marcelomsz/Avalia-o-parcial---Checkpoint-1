package com.marcelo.movie.repository;


import com.marcelo.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository <MovieEntity, Long> {
    List<MovieEntity> findByGenre(String genre);
}
