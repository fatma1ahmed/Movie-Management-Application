package com.fawry.movie_app.exception;

public class DuplicateRecordException extends RuntimeException{
    public DuplicateRecordException(){
        super();
    }
    public DuplicateRecordException(String message){
        super(message);
    }
}
