package com.movies.Movies.services;

import com.movies.Movies.domain.Movie;
import org.springframework.stereotype.Service;

public interface InMovieServe {
    Movie saveDetails(Movie movie);
}
