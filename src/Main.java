public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O Poderoso Chefao";
        myMovie.releaseDate = 1970;
        myMovie.movieDuration = 180;

        myMovie.renderMovieInfo();
        myMovie.sendReview(8);
        myMovie.sendReview(5);
        myMovie.sendReview(10);

        System.out.println(myMovie.sumReviews);
        System.out.println(myMovie.totalReviews);
        System.out.println(myMovie.ratingAverage());
    }
}