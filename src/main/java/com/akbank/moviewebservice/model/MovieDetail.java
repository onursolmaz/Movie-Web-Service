package com.akbank.moviewebservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class MovieDetail implements Serializable {

    private String imdbID;
    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;
    private String metascore;
    private String imdbRating;
    private String imdbVotes;
    private String type;
    private String DVD;
    private String boxOffice;
    private String production;
    private String website;
    private String response;


    public String objectAsJson(MovieDetail movieDetail) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(movieDetail);
        return jsonString;
    }

    @JsonProperty("Title")
    public void setTittle(String title) {
        this.title = title;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("Rated")
    public void setRated(String rated) {
        this.rated = rated;
    }

    @JsonProperty("Released")
    public void setReleased(String released) {
        this.released = released;
    }

    @JsonProperty("Runtime")
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("Director")
    public void setDirector(String director) {
        this.director = director;
    }

    @JsonProperty("Writer")
    public void setWriter(String writer) {
        this.writer = writer;
    }

    @JsonProperty("Actors")
    public void setActors(String actors) {
        this.actors = actors;
    }

    @JsonProperty("Plot")
    public void setPlot(String plot) {
        this.plot = plot;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Awards")
    public void setAwards(String awards) {
        this.awards = awards;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        this.poster = poster;
    }

    @JsonProperty("Metascore")
    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    @JsonProperty("imdbRating")
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    @JsonProperty("imdbVotes")
    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    @JsonProperty("imdbID")
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("DVD")
    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    @JsonProperty("BoxOffice")
    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    @JsonProperty("Production")
    public void setProduction(String production) {
        this.production = production;
    }

    @JsonProperty("Website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = response;
    }
}
