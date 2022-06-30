package com.akbank.moviewebservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Movie implements Serializable {

    private String imdbID;
    private String Title;
    private String Type;
    private String Poster;
    private String Year;

    @JsonProperty("imdbID")
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        Title = title;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        Type = type;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        Poster = poster;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        Year = year;
    }
}
