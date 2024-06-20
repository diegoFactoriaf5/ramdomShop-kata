package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        //arrange
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null,0, false, null );
        //act
        shoppingCart.addProduct(product);
        //assert
        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }
    @Test
    void calculatePriceForMagicCards_blackLotus() {
        //arrange
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null,0, false, null);
        //act
        shoppingCart.addProduct(product);
        //assert
        assertEquals(shoppingCart.getTotalPrice(), 40000.0);
    }
    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Phyrexian Obliterator", null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Dauntless Dourbark", null,0, false, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Swamp", null, 0, false, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null,0,false, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
    //TODO cambiar de null al precio en la función
    @Test
    void calculatePriceFishBlue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, true, "blue", null, null, null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }
    @Test
    void calculatePriceFishGold() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, true, "gold", null, null, null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }
    @Test
    void calculatePriceFish() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, true, null, null, null, null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(product.getBasePrice(), null);

    }

    @Test
    void calculatePriceForFourLeggedPet() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, null, null,0,false,null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);

    }
    @Test
    void calculatePriceForSpiderOf8Legs() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(0, null, false, null, null, null, null, 8, false, null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(),9.60);

    }
}