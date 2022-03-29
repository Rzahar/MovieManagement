package org.projet.service;

import org.projet.entity.Movie;
import org.projet.repository.MovieRepository;

public class MovieService {

    MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
            movieRepository.add(movie);
    }

}
