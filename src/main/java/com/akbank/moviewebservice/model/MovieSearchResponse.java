package com.akbank.moviewebservice.model;

import lombok.Data;

import java.util.List;


@Data
public class MovieSearchResponse {

    private boolean success;
    private List<Movie> result;
}
