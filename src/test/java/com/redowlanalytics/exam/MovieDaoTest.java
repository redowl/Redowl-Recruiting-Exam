package com.redowlanalytics.exam;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MovieDaoTest {
    IMovieDao dao;

    @BeforeMethod
    public void setUp()
    {
        dao = new MovieDao();
        dao.putMovieRating("Bladerunner", 5);
        dao.putMovieRating("Bladerunner", 1);
        dao.putMovieRating("The Empire Strikes Back", 1);
        dao.putMovieRating("The Empire Strikes Back", 1);
        dao.putMovieRating("The Empire Strikes Back", 2);
        dao.putMovieRating("The Empire Strikes Back", 3);
        dao.putMovieRating("The Empire Strikes Back", 5);
    }

    @Test(expectedExceptions = MovieDoesNotExistException.class)
    public void movieDaoThrowsMovieDoesNotExistExceptionWhenNonExistingMovieRatingsRequested() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Test
    public void movieDaoThrowsMovieDoesNotExistExceptionWhenNonExistingMovieIsDeleted() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Test
    public void movieDaoReturnsCorrectRatings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Test
    public void movieDaoProperlyAddsMovies() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Test
    public void movieRaterCanDeleteMovies() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Test
    public void movieRaterCanPutMovieRatings() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
