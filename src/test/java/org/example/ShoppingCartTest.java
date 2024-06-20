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

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }
    @Test
    void calculatePriceForMagicCards_blue_10_years() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 10, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.5);;

    }
    @Test
    void calculatePriceForMagicCards_red_10_years() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 10, false, "red", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.75);;

    }
    @Test
    void calculatePriceForMagicCards_green_20_years() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 20, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.28);;

    }
    @Test
    void calculatePriceForMagicCards_black_20_years() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 20, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.16);;

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

        BigDecimal bigDecimal = new BigDecimal("1.0");

        Product product = new Product(null, null, false, "blue", bigDecimal, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.10);
}
    @Test
    void calculatePriceForFish_gold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        BigDecimal bigDecimal = new BigDecimal("1.0");

        Product product = new Product(null, null, false, "gold", bigDecimal, null, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);
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
    @Test
    void calculatePriceFor_spider_gold_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true,"gold", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.3);
    }
    @Test
    void calculatePriceFor_spider_red_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true,"red", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.8);
    }
    @Test
    void calculatePriceFor_spider_default_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, true,"blue", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.8);
    }
    @Test
    void calculatePriceFor_spider_gold_is_not_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false,"gold", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 12.6);
    }
    @Test
    void calculatePriceFor_spider_red_is_not_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false,"red", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 11.6);
    }
    @Test
    void calculatePriceFor_spider_default_is_not_Stinky() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(8, null, false,"blue", null,"Spiders",null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 9.6);
    }

}