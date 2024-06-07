package br.cesul.ex02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Condominium {
    private Double water;
    private Double maintenance;
    private Double reservation;
    private Double othertax;
    private Integer numberofapartments;
    private LocalDate dueDate;

    public Condominium(Double water, Double maintenance, Double reservation, Double othertax, Integer numberofapartments, LocalDate dueDate) {
        this.water = water;
        this.maintenance = maintenance;
        this.reservation = reservation;
        this.othertax = othertax;
        this.numberofapartments = numberofapartments;
        this.dueDate = dueDate;
    }

    public Double getFee() {
        var today = LocalDate.now();
        var diff = dueDate.until(today, ChronoUnit.DAYS);

        if (diff > 0) {
            return calculateFee();
        }

        return calculateFee(diff);
    }

    public Double calculateFee() {
        return (water + maintenance + reservation + othertax) / numberofapartments;
    }

    public Double calculateFee(long daysOfDelay) {
        var baseFee = calculateFee();
        return baseFee + (baseFee * 0.05) + (baseFee * 0.01 * daysOfDelay);
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Double maintenance) {
        this.maintenance = maintenance;
    }

    public Double getReservation() {
        return reservation;
    }

    public void setReservation(Double reservation) {
        this.reservation = reservation;
    }

    public Double getOthertax() {
        return othertax;
    }

    public void setOthertax(Double othertax) {
        this.othertax = othertax;
    }

    public Integer getNumberofapartments() {
        return numberofapartments;
    }

    public void setNumberofapartments(Integer numberofapartments) {
        this.numberofapartments = numberofapartments;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
