package com.akbank.moviewebservice.service;

import com.akbank.moviewebservice.model.Movie;
import com.akbank.moviewebservice.model.MovieDetail;
import com.akbank.moviewebservice.service.interfaces.IMovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceB implements IMovieService {
    @Override
    public List<Movie> search(String name) {
        return null;
    }

    @Override
    public MovieDetail addToList(String id) {
        return null;
    }

    @Override
    public MovieDetail getDetail(String id) {
        return null;
    }
}
