package org.projet;

import org.projet.entity.Movie;
import org.projet.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Quel film souhaitez vous ajouter ? ");
        Scanner scTitle = new Scanner(System.in);
        String movieName = scTitle.nextLine();

        System.out.println("A quel genre appartient ce film?");
        Scanner scGenre = new Scanner(System.in);
        String movieGenre = scGenre.nextLine();

        Movie movie = new Movie();

        movie.setTitle(movieName);
        movie.setGenre(movieGenre);

        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
