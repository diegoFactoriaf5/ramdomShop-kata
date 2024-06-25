package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerrestrialAnimalTest {
    @Test
    void calculatePriceForFourLeggedPet() {
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(4, null,false, null);
        assertEquals(terrestrialAnimal.calculatePrice(), 16.8);
    }

    @Test
    void calculatePriceForSpiderOf8Legs() {
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(8,null,false,"Spider");
        assertEquals(terrestrialAnimal.calculatePrice(), 9.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsRed() {
       TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(8,"Red", false,"Spider");
        assertEquals(terrestrialAnimal.calculatePrice(), 11.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsGold() {
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(8,"Gold", false,"Spider");
        assertEquals(terrestrialAnimal.calculatePrice(), 12.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsRedStinky() {
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(8,"Red", true,"Spider");
        assertEquals(terrestrialAnimal.calculatePrice(), 5.8);
    }
    @Test
    void calculatePriceForSpiderOf8LegsGoldStinky() {
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(8,"Gold", true,"Spider");
        assertEquals(terrestrialAnimal.calculatePrice(), 6.3);
    }
}
