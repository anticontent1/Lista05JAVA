package br.cesul.ex04.exception;

public class UnsfishedRentalException extends Exception {
    public UnsfishedRentalException() {
        super("Can't calculate total for rentals still in progress");
    }
}
