package com.akbank.moviewebservice.service.interfaces;

import com.akbank.moviewebservice.model.Movie;
import com.akbank.moviewebservice.model.MovieDetail;

import java.util.List;

public interface IMovieService {

   List<Movie> search(String name);

   MovieDetail addToList(String id);

   MovieDetail getDetail(String id);
}
