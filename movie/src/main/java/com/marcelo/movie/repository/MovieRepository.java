package com.marcelo.movie.repository;


import com.marcelo.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <MovieEntity, Long> {
    MovieEntity findByGenre(String genre);
}
