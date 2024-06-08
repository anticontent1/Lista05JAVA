package br.cesul.ex04;

public class DistanceCarRental extends CarRental {

    private final Double hiredDistance;
    private Double usedDistance;

    public DistanceCarRental(String plate, String customer, String license, Double price, boolean insurance, Double hiredDistance) {
        super(plate, customer, license, price, insurance);
        this.hiredDistance = hiredDistance;
    }

    @Override
    public double getRentalTotal() {
        return 0;
    }

    public void finish(double usedDistance) {
        super.finish();
        this.usedDistance = usedDistance;
    }

    public Double getHiredDistance() {
        return hiredDistance;
    }

    public Double getUsedDistance() {
        return usedDistance;
    }


}
