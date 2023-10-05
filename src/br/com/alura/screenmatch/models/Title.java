package br.com.alura.screenmatch.models;

public class Title {

    private String name;
    private int releaseDate;
    private boolean includeInAccount;
    private double sumReviews;
    private int totalReviews;
    private int movieDuration;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isIncludeInAccount() {
        return includeInAccount;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludeInAccount(boolean includeInAccount) {
        this.includeInAccount = includeInAccount;
    }

    public void setSumReviews(double sumReviews) {
        this.sumReviews = sumReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getDurationInMinutes() {
        return this.movieDuration;
    }

    public void renderMovieInfo() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lancamento: " + releaseDate);
    }

    public void sendReview(double rating) {
        sumReviews += rating;
        totalReviews++;
    }

    public double getRatingAverage() {
        return this.sumReviews / totalReviews;
    }
}
