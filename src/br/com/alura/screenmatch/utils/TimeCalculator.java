package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public void addTitle(Title title) {
        totalTime += title.getDurationInMinutes();
    }

    public int getTotalTime() {
        return totalTime;
    }
}
