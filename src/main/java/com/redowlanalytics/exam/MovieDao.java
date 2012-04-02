package com.redowlanalytics.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieDao implements IMovieDao{
    Map<String, List<Integer>> movieRatings;

    public MovieDao()
    {
        movieRatings = new HashMap<String, List<Integer>>();
    }

    @Override
    public Iterable<String> getMovies() {
        return movieRatings.keySet();
    }

    @Override
    public Iterable<Integer> getMovieRatings(String movie) throws MovieDoesNotExistException {
        if(! movieRatings.containsKey(movie)) throw new MovieDoesNotExistException("Cannot find movie " + movie);
        return movieRatings.get(movie);
    }

    @Override
    public void putMovieRating(String movie, Integer rating) {
        if(! movieRatings.containsKey(movie)) movieRatings.put(movie, new ArrayList<Integer>());
        movieRatings.get(movie).add(rating);
    }

    @Override
    public void deleteMovie(String movie) throws MovieDoesNotExistException {
        if(! movieRatings.containsKey(movie)) throw new MovieDoesNotExistException("Cannot find movie " + movie);
        movieRatings.remove(movie);
    }
}
