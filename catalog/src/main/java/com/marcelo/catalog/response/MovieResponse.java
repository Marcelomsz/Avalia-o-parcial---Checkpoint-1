package com.marcelo.catalog.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponse {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}