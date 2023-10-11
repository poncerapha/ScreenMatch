package br.com.alura.screenmatch.exceptions;

public class ConvertErrorYearException extends RuntimeException {
    private String message;

    public ConvertErrorYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
