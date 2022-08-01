package com.ironhack.video;

public class TvShow extends Video{
    private int numberOfSeasons;

    public TvShow(String name, int year, String[] actors, int numberOfSeasons) {
        super(name, year, actors);
        setNumberOfSeasons(numberOfSeasons);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
