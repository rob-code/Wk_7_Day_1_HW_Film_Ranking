package com.codeclan.filmrank_hw;

import java.util.*;
import java.util.ArrayList;

public class Ranking {

    ArrayList<Movie> movies;

    public Ranking(ArrayList<Movie> movies){
        this.movies = movies;
    }

    public void listAllMovies(){

        for (int i=0; i < this.movies.size(); i++){
            System.out.println(movies.get(i).toString());
        }

    }

}
