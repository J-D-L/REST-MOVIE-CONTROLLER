package com.josh.movieservice.api;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.josh.movieservice.domain.Movie;
import com.josh.movieservice.domain.Search;
import com.josh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

   @Autowired
    MovieService service;

   RestTemplate restTemplate = new RestTemplate();

    @GetMapping(value = "/movie/{imdbId}")
    public Optional<Movie> findMovie(@RequestParam(value = "imdbId") String imdbId)
    {
        return service.findOne(imdbId);

    }

    @GetMapping(value = "omdb/{title}")
    public List<Movie> findOmdbMovie(@PathVariable(value = "title") String title)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        ResponseEntity<String> resp = restTemplate.getForEntity("http://www.omdbapi.com?s=".concat(title).concat("&apikey=eb2d8531"),String.class);
        Search movies = null;
        try {
            movies = objectMapper.readValue(resp.getBody(),Search.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies.getMovies();
    }

    @GetMapping(value = "omdb/movie/{id}")
    public Movie findOmdbMovieDetail(@PathVariable(value = "id") String id)
    {
        return getImdbMovie(id);
    }

    @PostMapping(value = "movie/{imdbId}")
    public Movie createMovie(@PathVariable(value = "imdbId") String imdbId)
    {
        Movie m = getImdbMovie(imdbId);
        return service.saveMovie(m);
    }

    @DeleteMapping(value = "movie/{imdbId}")
    public void deleteMovie(@PathVariable(value = "imdbId") String imdbId)
    {
        service.deleteMovie(imdbId);
    }

    private Movie getImdbMovie(String imdbId)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        ResponseEntity<String> resp = restTemplate.getForEntity("http://www.omdbapi.com?i=".concat(imdbId).concat("&apikey=eb2d8531"),String.class);
        Movie movies = null;
        try {
            movies = objectMapper.readValue(resp.getBody(),Movie.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
    @GetMapping(value = "/movie")
    public List<Movie> findAll()
    {
        return service.findAll();

    }


}


