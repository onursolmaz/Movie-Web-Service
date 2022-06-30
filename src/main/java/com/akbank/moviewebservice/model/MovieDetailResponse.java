package com.akbank.moviewebservice.model;

import lombok.Data;

import java.util.List;


@Data
public class MovieDetailResponse {

    private boolean success;
    private MovieDetail result;
}
