package com.josh.movieservice.service;

import com.josh.movieservice.Repo.MovieRepo;
import com.josh.movieservice.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@EnableTransactionManagement
public class MovieService
{
    @Autowired
    MovieRepo movieRepo;

    public Optional<Movie> findOne(String id)
    {
    return movieRepo.findById(id);
    }

    public Movie saveMovie(Movie m)
    {
        return movieRepo.save(m);
    }

    public List <Movie> findAll() {
       return movieRepo.findAll();
    }

    @Transactional
    public int deleteMovie(String imdbId)
    {
        return movieRepo.deleteByImdbID(imdbId);
    }
}
