package com.movies.Movies.services;

import com.movies.Movies.domain.Movie;
import com.movies.Movies.repository.InMovieRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServeClass implements InMovieServe{
    InMovieRepos inMovieRepos;

    @Autowired
    public MovieServeClass(InMovieRepos inMovieRepos) {
        this.inMovieRepos = inMovieRepos;
    }

    @Override
    public Movie saveDetails(Movie movie) {
        return inMovieRepos.save(movie);
    }
}
