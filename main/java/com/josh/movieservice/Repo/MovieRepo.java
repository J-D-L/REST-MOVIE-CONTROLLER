package com.josh.movieservice.Repo;

import com.josh.movieservice.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepo extends JpaRepository<Movie, String>
{
Movie findByTitle(@Param(value = "title") String title);
Movie findByImdbID(@Param(value = "imdbId") String imdbId);
int deleteByImdbID(@Param(value = "imdbId") String imdbId);
}
