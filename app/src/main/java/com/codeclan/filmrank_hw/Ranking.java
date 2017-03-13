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

    public int findIndexByName(String name){
        for(Movie m : movies){
            if (name == m.getTitle()){
                String info = "Index: " + movies.indexOf(m) + ", " + m.toString();
                return movies.indexOf(m);
            }
        }
        return -10;
    }

    public void moveTitleUpRanking(String title){
        int pos = this.findIndexByName(title);
            if (pos != 0) {
                Collections.swap(movies, pos, pos - 1);
            }
        for (int i=0; i < this.movies.size(); i++){
           movies.get(i).setCurrentRanking(i+1);
        }
    }

    public void moveTitleDownRanking(String title){
        int pos = this.findIndexByName(title);
        if (pos != 9) {
            Collections.swap(movies, pos, pos + 1);
        }
        for (int i=0; i < this.movies.size(); i++){
            movies.get(i).setCurrentRanking(i+1);
        }
    }




}
