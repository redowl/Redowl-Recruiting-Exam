package com.redowlanalytics.exam;

public class MovieDoesNotExistException extends Exception
{
    public MovieDoesNotExistException(String msg)
    {
        super(msg);
    }
}
