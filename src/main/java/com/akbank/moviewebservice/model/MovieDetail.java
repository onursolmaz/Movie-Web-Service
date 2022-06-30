package com.akbank.moviewebservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
public class MovieDetail implements Serializable {

    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Writer;
    private String Actors;
    private String Plot;
    private String Language;
    private String Country;
    private String Awards;
    private String Poster;
    private String Metascore;
    private String imdbRating;
    private String imdbVotes;
    private String imdbID;
    private String Type;
    private String DVD;
    private String BoxOffice;
    private String Production;
    private String Website;
    private String Response;


    @JsonProperty("Title")
    public void setTittle(String title) {
        Title = title;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        Year = year;
    }

    @JsonProperty("Rated")
    public void setRated(String rated) {
        Rated = rated;
    }

    @JsonProperty("Released")
    public void setReleased(String released) {
        Released = released;
    }

    @JsonProperty("Runtime")
    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        Genre = genre;
    }

    @JsonProperty("Director")
    public void setDirector(String director) {
        Director = director;
    }

    @JsonProperty("Writer")
    public void setWriter(String writer) {
        Writer = writer;
    }

    @JsonProperty("Actors")
    public void setActors(String actors) {
        Actors = actors;
    }

    @JsonProperty("Plot")
    public void setPlot(String plot) {
        Plot = plot;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        Language = language;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        Country = country;
    }

    @JsonProperty("Awards")
    public void setAwards(String awards) {
        Awards = awards;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        Poster = poster;
    }

    @JsonProperty("Metascore")
    public void setMetascore(String metascore) {
        Metascore = metascore;
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
        Type = type;
    }

    @JsonProperty("DVD")
    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    @JsonProperty("BoxOffice")
    public void setBoxOffice(String boxOffice) {
        BoxOffice = boxOffice;
    }

    @JsonProperty("Production")
    public void setProduction(String production) {
        Production = production;
    }

    @JsonProperty("Website")
    public void setWebsite(String website) {
        Website = website;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        Response = response;
    }
}
