package br.cesul.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void producttest() {
        var product = new Product("Alisson",200D,20D,10D,3);
        assertEquals(780D, product.getFinalPrice());
        }

    @Test
    public void servicetest() {
        var service = new Service("Moises",200D, ServiceCategory.STANDARD,20D,3D);
        assertEquals(741.6, service.getFinalPrice());
    }
}


