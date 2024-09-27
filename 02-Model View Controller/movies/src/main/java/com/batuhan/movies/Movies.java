package com.batuhan.movies;

public class Movies {
    
    private String title;
    private String year;
    private double rating;

    public Movies(String title, String year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public Movies() {

    }

    public String getTitle() {
        return this.title;
    } 

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}