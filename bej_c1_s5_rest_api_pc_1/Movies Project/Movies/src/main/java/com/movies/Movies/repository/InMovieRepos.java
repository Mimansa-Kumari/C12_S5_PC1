package com.movies.Movies.repository;

import com.movies.Movies.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMovieRepos extends CrudRepository<Movie,Integer> {
}
