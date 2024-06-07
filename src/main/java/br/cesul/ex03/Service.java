package br.cesul.ex03;

public class Service extends SaleItem {

    private final ServiceCategory category;
    private final double iss;
    private final Double time;

    public Service(String name, Double price, ServiceCategory category, double iss, Double time) {
        super(name, price);
        this.category = category;
        this.iss = iss;
        this.time = time;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    public double getIss() {
        return iss;
    }

    public Double getTime() {
        return time;
    }
}
