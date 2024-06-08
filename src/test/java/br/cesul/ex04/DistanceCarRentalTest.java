package br.cesul.ex04;

import br.cesul.ex04.exception.UnsfishedRentalException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DistanceCarRentalTest {

    @Test
    @DisplayName("Tries to calculate total for unfinished rental")
    void testTryCalculateUnfinishedRental() {
        var carRental = new DistanceCarRental("AXY-8711","Alisson Koerich","123456",2d,true,1000d);

        assertThrows(UnsfishedRentalException.class, () -> carRental.getRentalTotal());
    }
    void setup() {
        this.carRental = new DistanceCarRental("AXY-8711", "João da Silva", "123456",2D,true,1000d);

        try {
            carRental.getRentalTotal();
        } catch(UnsfishedRentalException ex) {
            ,

        }
    }

    @Test
    @DisplayName("Tries to calculate total for unfinished rental")
    void testCalculateUnfinishedRental() {
        var carRental = new DistanceCarRental()
    }
}
