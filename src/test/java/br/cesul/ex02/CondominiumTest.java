package br.cesul.ex02;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondominiumTest {

    @Test
    public void testCondominiumWithoutDelay() {
        var condominium = new Condominium(
                1000D,
                3000D,
                1500D,
                500D,
                15,
                LocalDate.now());

        assertEquals(400D, condominium.getFee());
    }
}
