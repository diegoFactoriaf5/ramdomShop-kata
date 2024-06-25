package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        //arrange
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null,false, false);
        //act
        shoppingCart.addProduct(product);
        //assert
        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }
    @Test
    void calculatePriceForMagicCards_blackLotus() {
        //arrange
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null, false, false);
        //act
        shoppingCart.addProduct(product);
        //assert
        assertEquals(shoppingCart.getTotalPrice(), 40000.0);
    }
    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Phyrexian Obliterator", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.8);

    }

    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Dauntless Dourbark", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.4);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Swamp", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.0);

    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

    }
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

    @Test
    void calculatePriceForFourLeggedPet() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(4, null, false, null, null, null, null,false, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 16.8);

    }

    @Test
    void calculatePriceForTenYearsMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Water Weird", null, true, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.5);

    }

    @Test
    void calculatePriceForTenYearsMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Water Weird", null, true, false);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.75);
    }

    @Test
    void calculatePriceForTwentyYearsMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Phyrexian Obliterator 2.0", null, false, true);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.16);

    }

    @Test
    void calculatePriceForTwentyYearsMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Phyrexian Obliterator", null, false, true);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.28);

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