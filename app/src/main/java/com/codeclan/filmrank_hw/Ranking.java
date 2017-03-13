package com.codeclan.filmrank_hw;

import java.util.*;
import java.util.ArrayList;

public class Ranking {

    ArrayList<Movie> movies;
    ArrayList<Movie> rankedMovies;
    Movie movie;

    public Ranking(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void listAllMovies(){
        for (int i=0; i < this.movies.size(); i++){
            System.out.println(this.movies.get(i).toString());
        }
    }

    public String getMovieDescriptionByRank(Integer rank){
        return this.movies.get(rank-1).toString();
    }

    public String getMovieTitleByRank(Integer rank){
        return this.movies.get(rank-1).getTitle();
    }

    public void replaceLastMovie(Movie movie){
        this.movies.remove(9);
        this.movies.add(9, movie);
    }

    public void sortList(){
        Collections.sort(movies);
    }

}
