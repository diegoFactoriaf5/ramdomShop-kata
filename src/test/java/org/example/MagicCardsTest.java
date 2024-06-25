package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicCardsTest {

    @Test
void calculatePriceForMagicCards_red() {
    MagicCards magicCards = new MagicCards("Magic: The Gathering","red", false, false);
    assertEquals(magicCards.calculatePrice(), 3.5);
}
    @Test
    void calculatePriceForMagicCards_blackLotus() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering - Black Lotus",null, false, false);
        assertEquals(magicCards.calculatePrice(), 40000.0);
    }
    @Test
    void calculatePriceForMagicCards_black() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","black", false, false);
        assertEquals(magicCards.calculatePrice(), 6.8);
    }

    @Test
    void calculatePriceForMagicCards_green() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","green", false, false);
        assertEquals(magicCards.calculatePrice(), 4.4);
    }

    @Test
    void calculatePriceForMagicCards_blue() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","blue", false, false);
        assertEquals(magicCards.calculatePrice(), 5.0);
    }
    @Test
    void calculatePriceForMagicCards_brown() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","brown", false, false);
        assertEquals(magicCards.calculatePrice(), 2.0);

    }
    @Test
    void calculatePriceForTenYearsMagicCards_blue() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","blue", true, false);
        assertEquals(magicCards.calculatePrice(), 2.5);
    }

    @Test
    void calculatePriceForTenYearsMagicCards_red() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","red", true, false);
        assertEquals(magicCards.calculatePrice(), 1.75);
    }

    @Test
    void calculatePriceForTwentyYearsMagicCards_black() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","black", false, true);
        assertEquals(magicCards.calculatePrice(), 8.16);
    }

    @Test
    void calculatePriceForTwentyYearsMagicCards_green() {
        MagicCards magicCards = new MagicCards("Magic: The Gathering","green", false, true);
        assertEquals(magicCards.calculatePrice(), 5.28);
    }

}
