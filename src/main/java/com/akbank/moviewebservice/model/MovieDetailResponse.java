package com.akbank.moviewebservice.model;

import lombok.Data;


@Data
public class MovieDetailResponse {

    private boolean success;
    private MovieDetail result;
}
