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
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, null, null, "Spider", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 9.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsRed() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "Red", null, "Spider", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 11.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsGold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false, "Gold", null, "Spider", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 12.6);
    }
    @Test
    void calculatePriceForSpiderOf8LegsRedStinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "Red", null, "Spider", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.8);
    }
    @Test
    void calculatePriceForSpiderOf8LegsGoldStinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true, "Gold", null, "Spider", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.3);
    }
}
