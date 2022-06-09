package com.marcelo.movie.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MovieDTO {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
