package com.codeclan.filmrank_hw;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class RankingTest {

    ArrayList<Movie> movies;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Movie moviexx;
    Ranking ranking;

    @Before
    public void before(){
        movie1 = new Movie("Point Break","Action",1);
        movie2 = new Movie("The English Patient", "Historiographic metafiction", 2);
        movie3 = new Movie("Jaws", "Thriller", 3);
        movie4 = new Movie("Gone With The Wind", "Romance", 4);
        movie5 = new Movie("Jaws II", "Thriller", 5);
        movie6 = new Movie("Jaws III", "Thriller", 6);
        movie7 = new Movie("Rocky", "Drama", 7);
        movie8 = new Movie("Rocky II", "Drama", 8);
        movie9 = new Movie("Rocky III", "Drama", 9);
        movie10 = new Movie("Rocky IV", "Drama", 10);

        movies = new ArrayList<Movie>();
        movies.add(movie10);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie7);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie4);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie1);
        ranking = new Ranking(movies);
    }

    @Test
    public void canListAllMovies(){
        ranking.sortList();
        ranking.listAllMovies();
    }

    @Test
    public void canGetMovieTitleByRank(){
        ranking.sortList();
        assertEquals("Title: Point Break, Genre:  Action, Ranking: 1", ranking.getMovieDescriptionByRank(1));
    }

    @Test
    public void canReplaceLowestRankingMovie(){
        ranking.sortList();
        moviexx = new Movie("2001 A Space Odyssey","Sci Fi",10);
        ranking.replaceLastMovie(moviexx);
        assertEquals("2001 A Space Odyssey", ranking.getMovieTitleByRank(10));
        ranking.listAllMovies();
    }

    @Test
    public void canSortFavouritesByRank(){
       ranking.sortList();
        ranking.listAllMovies();
    }

    @Test
    public void canFindIndexByName(){
        String details = ranking.findIndexByName("Jaws II");
        assertEquals("Index: 4, Title: Jaws II, Genre:  Thriller, Ranking: 5", details);
    }


}
