package com.redowlanalytics.exam;

public class NotEnoughRatingsException extends Exception
{
    public NotEnoughRatingsException(String msg)
    {
        super(msg);
    }
}
