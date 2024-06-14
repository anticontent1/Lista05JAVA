package br.cesul.ex04;

import br.cesul.ex04.exception.UnsfishedRentalException;

import java.time.temporal.ChronoUnit;

public class UnlimitedCarRental extends CarRental {

    public UnlimitedCarRental(String plate, String customer, String license, Double price, boolean insurance) {
        super(plate, customer, license, price, insurance);
    }

    @Override
    public double getRentalTotal() throws UnsfishedRentalException {
        if (getStatus() != RentalStatus.FINISHED) {
            throw new UnsfishedRentalException();
        }

        var rentalDuration = startDate.until(finishDate, ChronoUnit.DAYS);
        var rentalTotal = rentalDuration * price;

        if (insurance) {
    }

}
