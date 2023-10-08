package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.TvShow;
import br.com.alura.screenmatch.utils.TimeCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie favoriteMovie = new Movie("The Matrix", 1999);
        favoriteMovie.setMovieDuration(135);
        favoriteMovie.setIncludeInAccount(true);

        Movie otherMovie = new Movie("John Wick", 2014);
        otherMovie.setMovieDuration(101);
        otherMovie.setIncludeInAccount(true);

        TvShow tvShow = new TvShow("La casa de Papel", 2017);
        tvShow.setIncludeInAccount(true);
        tvShow.setRunning(true);
        tvShow.setSeason(5);
        tvShow.setEpisodePerSeason(10);
        tvShow.setMinutesPerEpisode(45);

        TimeCalculator calculator = new TimeCalculator();
        calculator.addTitle(favoriteMovie);
        calculator.addTitle(otherMovie);
        calculator.addTitle(tvShow);
        System.out.println("Tempo total: " +calculator.getTotalTime());

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(favoriteMovie);
        movies.add(otherMovie);

        System.out.println("list size: " + movies.size());
        System.out.println("first movie: " + movies.get(0).getName());
        System.out.println(movies);
    }
}