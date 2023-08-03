package com.movies.Movies.controller;

import com.movies.Movies.domain.Movie;
import com.movies.Movies.services.InMovieServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MovieControllerClass {
    InMovieServe inMovieServe;

    @Autowired
    public MovieControllerClass(InMovieServe inMovieServe) {
        this.inMovieServe = inMovieServe;
    }

    @PostMapping("/movie")
    public ResponseEntity saveDetails(@RequestBody Movie movie)
    {
        Movie movie1 = inMovieServe.saveDetails(movie);
        System.out.println("Data saved");
        return new ResponseEntity(movie1, HttpStatus.CREATED);
    }
}
