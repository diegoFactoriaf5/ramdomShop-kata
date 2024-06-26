package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GourmetProductTest {
    @Test
    void calculatePriceForWine() {
        GourmetProduct gourmetProduct = new GourmetProduct(4,false);
        assertEquals(gourmetProduct.calculatePrice(), 80.0);
    }

    @Test
    void calculatePriceForCheese() {
        GourmetProduct gourmetProduct = new GourmetProduct(5, true);
        assertEquals(gourmetProduct.calculatePrice(), 50.0);
    }
}