package com.redowlanalytics.exam;

public interface IMovieDao {
    public Iterable<String> getMovies();
    public Iterable<Integer> getMovieRatings(String movie) throws MovieDoesNotExistException;
    public void putMovieRating(String movie, Integer rating);
    public void deleteMovie(String movie) throws MovieDoesNotExistException;
}
