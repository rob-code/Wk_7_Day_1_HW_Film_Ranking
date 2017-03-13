package com.codeclan.filmrank_hw;

import java.util.*;

public class Movie implements Comparable<Movie> {

    private String title;
    private String genre;
    private Integer currentRanking;


    public Movie(String title, String genre, Integer currentRanking){
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCurrentRanking() {
        return currentRanking;
    }

    public void setCurrentRanking(Integer currentRanking) {
        this.currentRanking = currentRanking;
    }


    @Override
    public int compareTo(Movie movie) {
        int compareRank=((Movie)movie).getCurrentRanking();
        return this.currentRanking - compareRank;

    }

    @Override
    public String toString(){
        return "Title: " + getTitle() + ", Genre:  " + getGenre() + ", Ranking: " + Integer.toString(getCurrentRanking());

    }



}



