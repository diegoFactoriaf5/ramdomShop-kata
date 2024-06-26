package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquaticAnimalTest {

    @Test
    void calculatePriceFishBlue() {
        AquaticAnimal aquaticAnimal = new AquaticAnimal("blue", 0);
        assertEquals(aquaticAnimal.calculatePrice(), 0.10);

    }
    @Test
    void calculatePriceFishGold() {
        AquaticAnimal aquaticAnimal = new AquaticAnimal("gold", 1);
        assertEquals(aquaticAnimal.calculatePrice(), 100);

    }
    @Test
    void calculatePriceFish() {
        AquaticAnimal aquaticAnimal = new AquaticAnimal( "", 0);
        assertEquals(aquaticAnimal.calculatePrice(), 0);

    }
}
