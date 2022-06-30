package com.akbank.moviewebservice.model;

import lombok.Data;

import java.util.List;


@Data
public class MovieResponse {

    private boolean success;
    private List<Movie> result;
}
