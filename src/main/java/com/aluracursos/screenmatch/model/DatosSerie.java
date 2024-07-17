package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons")Integer totalTemporadas,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Poster")String poster,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Actors")String actores,
        @JsonAlias("Plot")String sinopsis) {
    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public Integer totalTemporadas() {
        return totalTemporadas;
    }

    @Override
    public String evaluacion() {
        return evaluacion;
    }

    @Override
    public String poster() {
        return poster;
    }

    @Override
    public String genero() {
        return genero;
    }

    @Override
    public String actores() {
        return actores;
    }

    @Override
    public String sinopsis() {
        return sinopsis;
    }
}
