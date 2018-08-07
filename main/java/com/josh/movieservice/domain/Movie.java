package com.josh.movieservice.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie
{

    private String title;
    private String year;
    private String genre;
    private String rated;
    private String released;
    private String runtime;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String imdbVotes;

    @Id
    private String imdbID;
    private String poster;
    private String type;
    private String production;
    private String webSite;
    private String awards;
    private String imdbRating;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(getTitle(), movie.getTitle()) &&
                Objects.equals(getYear(), movie.getYear()) &&
                Objects.equals(getGenre(), movie.getGenre()) &&
                Objects.equals(getRated(), movie.getRated()) &&
                Objects.equals(getReleased(), movie.getReleased()) &&
                Objects.equals(getRuntime(), movie.getRuntime()) &&
                Objects.equals(getDirector(), movie.getDirector()) &&
                Objects.equals(getWriter(), movie.getWriter()) &&
                Objects.equals(getActors(), movie.getActors()) &&
                Objects.equals(getPlot(), movie.getPlot()) &&
                Objects.equals(getLanguage(), movie.getLanguage()) &&
                Objects.equals(getCountry(), movie.getCountry()) &&
                Objects.equals(getImdbVotes(), movie.getImdbVotes()) &&
                Objects.equals(getImdbID(), movie.getImdbID()) &&
                Objects.equals(getPoster(), movie.getPoster()) &&
                Objects.equals(getType(), movie.getType()) &&
                Objects.equals(getProduction(), movie.getProduction()) &&
                Objects.equals(getWebSite(), movie.getWebSite()) &&
                Objects.equals(getAwards(), movie.getAwards()) &&
                Objects.equals(getImdbRating(), movie.getImdbRating());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTitle(), getYear(), getGenre(), getRated(), getReleased(), getRuntime(), getDirector(), getWriter(), getActors(), getPlot(), getLanguage(), getCountry(), getImdbVotes(), getImdbID(), getPoster(), getType(), getProduction(), getWebSite(), getAwards(), getImdbRating());
    }
}
