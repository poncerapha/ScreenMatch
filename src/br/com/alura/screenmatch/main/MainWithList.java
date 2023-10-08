package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Title;
import br.com.alura.screenmatch.models.TvShow;

import java.util.ArrayList;
import java.util.Collections;

public class MainWithList {
    public static void main(String[] args) {
        Movie favoriteMovie = new Movie("The Matrix", 1999);
        favoriteMovie.sendReview(10);
        Movie otherMovie = new Movie("John Wick", 2014);
        otherMovie.sendReview(9);
        TvShow tvShow = new TvShow("La casa de Papel", 2017);

        ArrayList<Title> list = new ArrayList<>();
        list.add(favoriteMovie);
        list.add(otherMovie);
        list.add(tvShow);

        list.forEach( title -> {
            System.out.println(title.getName());
            if (title instanceof Movie movie && movie.getRatingAverage() > 2) {
                System.out.println("Classificao: " + movie.getRatingAverage());
            }
        });

        Collections.sort(list);
        System.out.println(list);
    }
}
