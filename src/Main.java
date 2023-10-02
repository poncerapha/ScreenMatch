import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefao");
        myMovie.setReleaseDate(1970);
        myMovie.setMovieDuration(180);
        myMovie.setIncludeInAccount(true);

        myMovie.renderMovieInfo();
        myMovie.sendReview(8);
        myMovie.sendReview(5);
        myMovie.sendReview(10);

        System.out.println("MEdia de avalicaoes do filme: " + myMovie.getRatingAverage());
    }
}