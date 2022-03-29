package org.projet.repository;

import org.projet.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static List<Movie>movies = new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("Le film " + movie.getTitle() + " a bien été ajouté. Il est rangé dans la catégorie " + movie.getGenre() + "." );

    }
}
