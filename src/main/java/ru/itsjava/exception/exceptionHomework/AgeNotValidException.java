package ru.itsjava.exception.exceptionHomework;

public class AgeNotValidException extends RuntimeException{

    public AgeNotValidException(String message){
        super(message);
    }
}
