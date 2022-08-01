package com.ironhack.video;

public class Movie extends Video{
    private double budgetInMillions;

    public Movie(String name, int year, String[] actors, double budgetInMillions) {
        super(name, year, actors);
        setBudgetInMillions(budgetInMillions);
    }

    public double getBudgetInMillions() {
        return budgetInMillions;
    }

    public void setBudgetInMillions(double budgetInMillions) {
        this.budgetInMillions = budgetInMillions;
    }
}
