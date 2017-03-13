package com.codeclan.filmrank_hw;

import static org.junit.Assert.*;
import org.junit.*;

public class MovieTest {

    Movie movie1;
    Movie movie2;


    @Before
    public void before(){
        movie1 = new Movie("Point Break","Action",1);
        movie2 = new Movie("The English Patient", "Historiographic metafiction", 2);
    }

    @Test
    public void canGetMovieTitle1(){
    assertEquals("Point Break", movie1.getTitle());
    }

    @Test
    public void canGetMovieTitle2(){
        assertEquals("The English Patient", movie2.getTitle());
    }

    @Test
    public void canGetMovieGenre1(){
        assertEquals("Action", movie1.getGenre());
    }

    @Test
    public void canGetMovieRanking1(){
        assertEquals(1, movie1.getCurrentRanking());
    }

    @Test
    public void testToString(){
        assertEquals("Title: Point Break, Genre:  Action, Ranking: 1", movie1.toString());
    }

}
