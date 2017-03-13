package com.codeclan.filmrank_hw;

import java.util.*;
import java.util.ArrayList;

public class Ranking {

    ArrayList<Movie> movies;
    Movie movie;

    public Ranking(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void listAllMovies(){
        for (int i=0; i < this.movies.size(); i++){
            System.out.println(movies.get(i).toString());
        }
    }

    public String getMovieByRank(Integer rank){
        return movies.get(rank-1).toString();
    }

}
