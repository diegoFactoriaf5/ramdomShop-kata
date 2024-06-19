package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }
    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }
    @Test
    void calculatePriceForMagicCards_default() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "other", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }


    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 10, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 200.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
    @Test
    void calculatePriceForFish_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        BigDecimal bigDecimal = new BigDecimal("0.10");

        Product product = new Product(null, null, false, "blue", bigDecimal, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.20);
}
    @Test
    void calculatePriceForFish_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        BigDecimal bigDecimal = new BigDecimal("100.0");

        Product product = new Product(null, null, false, "gold", bigDecimal, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 10000.0);
    }
    @Test
    void calculatePriceForFish_default() {
        ShoppingCart shoppingCart = new ShoppingCart();

        BigDecimal bigDecimal = new BigDecimal("0.0");

        Product product = new Product(null, null, false, "other", bigDecimal, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 0.0);
    }
    @Test
    void calculatePriceFor_Black_Lotus() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, null,null, "Magic: The Gathering - Black Lotus", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 40000.0);
    }
    @Test
    void calculatePriceFor_animals_terrestrial() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null,null, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);
    }

    @Test
    void calculatePriceFor_chocolate() {
        ShoppingCart shoppingCart = new ShoppingCart();

        BigDecimal bigDecimal = new BigDecimal("1.0");

        Product product = new Product(null, null, false,"black", bigDecimal,null,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.0);
    }


}