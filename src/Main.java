import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.TvShow;
import br.com.alura.screenmatch.utils.TimeCalculator;

public class Main {
    public static void main(String[] args) {
        Movie favoriteMovie = new Movie();
        favoriteMovie.setName("The Matrix");
        favoriteMovie.setReleaseDate(1999);
        favoriteMovie.setMovieDuration(135);
        favoriteMovie.setIncludeInAccount(true);

        Movie otherMovie = new Movie();
        otherMovie.setName("John Wick");
        otherMovie.setReleaseDate(2014);
        otherMovie.setMovieDuration(101);
        otherMovie.setIncludeInAccount(true);

        TvShow tvShow = new TvShow();
        tvShow.setName("La Casa de Papel");
        tvShow.setReleaseDate(2017);
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
    }
}