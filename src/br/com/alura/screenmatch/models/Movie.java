package br.com.alura.screenmatch.models;

public class Movie extends Title {

    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + "(" + this.getReleaseDate() + ")";
    }
}
