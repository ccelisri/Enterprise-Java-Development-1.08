package com.ironhack.video;

public class Video {
    private String name;
    private int year;
    private String[] actors;

    public Video(String name, int year, String[] actors) {
        setName(name);
        setYear(year);
        setActors(actors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }
}



