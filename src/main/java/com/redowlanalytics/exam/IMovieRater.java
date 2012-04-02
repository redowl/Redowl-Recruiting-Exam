package com.redowlanalytics.exam;

public interface IMovieRater {
    public double getMovieRating(Iterable<Integer> userRating) throws NotEnoughRatingsException;
}
