package com.akbank.moviewebservice.controllers;


import com.akbank.moviewebservice.model.Movie;
import com.akbank.moviewebservice.model.MovieDetail;
import com.akbank.moviewebservice.service.IMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final IMovieService movieService;

    @GetMapping(value = "/movies/search")
    public List<Movie> search(@RequestParam(name = "movie_name") String name){
        return movieService.search(name);
    }


    @GetMapping("/movies/saveToList/{id}")
    public MovieDetail addToList(@PathVariable(name = "id") String id){
        return movieService.addToList(id);
    }

    @GetMapping("/movies/detail/{id}")
    public MovieDetail detail(@PathVariable(name = "id") String id){
        return movieService.getDetail(id);
    }






}
