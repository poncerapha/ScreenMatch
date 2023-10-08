package br.com.alura.screenmatch.models;

public class TvShow extends Title {
    private int season;
    private boolean isRunning;
    private int episodePerSeason;
    private int minutesPerEpisode;

    public TvShow(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public int getEpisodePerSeason() {
        return episodePerSeason;
    }

    public void setEpisodePerSeason(int episodePerSeason) {
        this.episodePerSeason = episodePerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return season * episodePerSeason * minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + "(" + this.getReleaseDate() + ")";

    }
}
