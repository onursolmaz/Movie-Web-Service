package com.akbank.moviewebservice.service;

import com.akbank.moviewebservice.model.Movie;
import com.akbank.moviewebservice.model.MovieDetail;
import com.akbank.moviewebservice.model.MovieDetailResponse;
import com.akbank.moviewebservice.model.MovieSearchResponse;
import com.akbank.moviewebservice.service.interfaces.IMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MovieService implements IMovieService {


    private final FileService fileService;
    private RestTemplate restTemplate=new RestTemplate();
    private HttpHeaders headers=new HttpHeaders();
    private HttpEntity<?> requestEntity=new HttpEntity<>(this.headers);


    @Override
    public List<Movie> search(String name) {
        String url="https://api.collectapi.com/imdb/imdbSearchByName?query="+name;
        ResponseEntity<MovieSearchResponse> response=this.restTemplate.exchange(url, HttpMethod.GET,this.requestEntity, MovieSearchResponse.class);
        MovieSearchResponse movieSearchResponse =response.getBody();
        return movieSearchResponse.getResult();
    }

    @Override
    public MovieDetail addToList(String id) {
        MovieDetail movieDetail = this.getDetail(id);
        fileService.writeFile(movieDetail);
        return movieDetail;
    }

    @Override
    public MovieDetail getDetail(String id) {
        MovieDetail movieDetail = fileService.readToFile(id);

        //if exits in file, return detail
        if(Objects.nonNull(movieDetail)){
            return movieDetail;
        }

        String url="https://api.collectapi.com/imdb/imdbSearchById?movieId="+id;
        ResponseEntity<MovieDetailResponse> response=this.restTemplate.exchange(url, HttpMethod.GET,this.requestEntity,MovieDetailResponse.class);
        MovieDetailResponse movieDetailResponse=response.getBody();
        return movieDetailResponse.getResult();

    }

    @PostConstruct
    private void setHeaders() {
        this.headers.add("content-type","application/json");
        this.headers.add("authorization","apikey 3vFo0gyq1yuT2Uh5dTxCxn:6kQsGTZKaWVgDD4bF5BleN");
        this.headers.add("user-agent", "Application");
    }



}
