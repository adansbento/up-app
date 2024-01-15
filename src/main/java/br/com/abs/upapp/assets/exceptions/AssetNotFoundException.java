package br.com.abs.upapp.assets.exceptions;

public class AssetNotFoundException extends  RuntimeException {

    public AssetNotFoundException(String message) {
        super(message);
    }
}