package com.redowlanalytics.exam;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class MovieRaterTest {

    IMovieRater rater;

    @BeforeMethod
    public void setUp()
    {
        rater = new MovieRater();
    }

    @Test(expectedExceptions = NotEnoughRatingsException.class)
    public void movieRaterThrowsExceptionWhenZeroRatingsPassed() throws NotEnoughRatingsException {
        List<Integer> ratings = new ArrayList<Integer>();
        double rating = rater.getMovieRating(ratings);
    }

    @Test(expectedExceptions = NotEnoughRatingsException.class)
    public void movieRaterThrowsExceptionWhenOneRatingPassed() throws NotEnoughRatingsException {
        List<Integer> ratings = new ArrayList<Integer>();
        ratings.add(5);
        double rating = rater.getMovieRating(ratings);
    }

    @Test(expectedExceptions = NotEnoughRatingsException.class)
    public void movieRaterThrowsExceptionWhenTwoRatingsPassed() throws NotEnoughRatingsException {
        List<Integer> ratings = new ArrayList<Integer>();
        ratings.add(5);
        ratings.add(7);
        double rating = rater.getMovieRating(ratings);
    }

    @Test(expectedExceptions = NotEnoughRatingsException.class)
    public void movieRaterThrowsExceptionWhenTwoUniqueRatingsPassed() throws NotEnoughRatingsException {
        List<Integer> ratings = new ArrayList<Integer>();
        ratings.add(5);
        ratings.add(5);
        ratings.add(5);
        ratings.add(7);
        ratings.add(7);
        double rating = rater.getMovieRating(ratings);
    }

    @Test
    public void movieRaterProperlyCalculatesRatings() throws NotEnoughRatingsException {
        List<Integer> ratings = new ArrayList<Integer>();
        ratings.add(-2);
        ratings.add(-2);
        ratings.add( 3);
        ratings.add( 7);
        ratings.add( 8);
        ratings.add( 9);
        ratings.add(15);
        ratings.add(15);
        ratings.add(15);
        double rating = rater.getMovieRating(ratings);
        assertEquals(6.75D, rating, 0.0000001D);
    }
}
