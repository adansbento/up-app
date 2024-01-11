package br.com.abs.upapp.asserts.exceptions;

public class AssertNotFoundException extends  RuntimeException {

    public AssertNotFoundException(String message) {
        super(message);
    }
}