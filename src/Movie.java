public class Movie {
    String name;
    int releaseDate;
    boolean includeInAccount;
    double sumReviews;
    int totalReviews;
    int movieDuration;

    void renderMovieInfo() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lancamento: " + releaseDate);
    }

    void sendReview(double rating) {
        sumReviews += rating;
        totalReviews++;
    }

    double ratingAverage() {
        return this.sumReviews / totalReviews;
    }
}
