package br.cesul.ex04;

import br.cesul.ex04.exception.UnsfishedRentalException;

import java.time.LocalDate;

public abstract class CarRental {

    private final String plate;
    private final String customer;
    private final String license;
    protected final Double price;
    protected final boolean insurance;

    private RentalStatus status;
    protected LocalDate finishDate;

    public CarRental(String plate, String customer, String license, Double price, boolean insurance) {
        this.plate = plate;
        this.customer = customer;
        this.license = license;
        this.price = price;
        this.insurance = insurance;
        this.status = RentalStatus.IN_PROGRESS;
    }

    public abstract double getRentalTotal() throws UnsfishedRentalException;

    protected void finish() {
        this.status = RentalStatus.FINISHED;
        this.finishDate = LocalDate.now();
    }

    public String getPlate() {
        return plate;
    }

    public String getCustomer() {
        return customer;
    }

    public String getLicense() {
        return license;
    }

    public Double getPrice() {
        return price;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }
}
