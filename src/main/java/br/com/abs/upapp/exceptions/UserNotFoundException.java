package br.com.abs.upapp.exceptions;

public class UserNotFoundException extends  Throwable{
    public UserNotFoundException(String message) {
        super(message);
    }
}
