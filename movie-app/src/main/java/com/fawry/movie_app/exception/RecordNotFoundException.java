package com.fawry.movie_app.exception;

public class RecordNotFoundException extends RuntimeException
{
    public RecordNotFoundException(){
        super();
    }
    public RecordNotFoundException(String message){
        super(message);
    }
}
