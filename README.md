# ShoppingCart Project

This program allows adding various products to the cart and calculates the total price based on specific criteria for different product types.

## Package Structure

The project consists of two main classes:

1. **ShoppingCart**: This class represents the shopping cart where products can be added, and it provides functionality to calculate the total price.
2. **Product**: This class represents the product with various attributes like number of legs, age, stinky status, color, base price, name, and sell price.

## Classes

### ShoppingCart

This class contains the following key methods:

- `addProduct`: Adds a product to the shopping cart.
- `getTotalPrice`: Calculates and returns the total price of all products in the cart.
- `calculatePrice`: Determines the price of a single product based on its type and attributes.
- `calculateAnimalPrice`: Calculates the price for animal products.
- `calculateNotAnimalPrice`: Calculates the price for non-animal products.
- `calculateTerrestrialPrice`: Calculates the price for terrestrial animals.
- `countSpidersPrice`: Calculates the price for spider products.
- `countFishPrice`: Calculates the price for fish products.
- `countGourmetPrice`: Calculates the price for gourmet products.
- `countLotusPrice`: Calculates the price for "Magic: The Gathering - Black Lotus" cards.
- `countCardsPrice`: Calculates the price for other "Magic: The Gathering" cards.
- `divideCards`: Helper method to adjust the price of cards based on age and stinky status.
- `calculatePercentage`: Helper method to calculate a percentage increase for old cards.

### Product

This class represents a product with the following attributes:

- `numberOfLegs`: Number of legs the product has (if applicable).
- `age`: Age of the product (if applicable).
- `isStinky`: Boolean indicating if the product is stinky.
- `color`: Color of the product.
- `basePrice`: Base price of the product.
- `name`: Name of the product.
- `sellPrice`: Selling price of the product.

## Tests

### 1. **calculatePriceForMagicCards_red()**:
   - This test verifies the price calculation for a red "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". The expected price is 3.5.

### 2. **calculatePriceForMagicCards_blue()**:
   - This test checks the price calculation for a blue "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal". The expected price is 5.0.

### 3. **calculatePriceForMagicCards_green()**:
   - This test ensures the price calculation for a green "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". The expected price is 4.4.

### 4. **calculatePriceForMagicCards_black()**:
   - This test validates the price calculation for a black "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". The expected price is 6.8.

### 5. **calculatePriceForMagicCards_default()**:
   - This test confirms the price calculation for a "Magic: The Gathering" card with a default color (brown) named "Magic: The Gathering - Lightning Bolt". The expected price is 2.0.

### 6. **calculatePriceForMagicCards_blue_10_years()**:
   - This test checks the price calculation for a blue "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 10 years old. The expected price is 2.5.

### 7. **calculatePriceForMagicCards_red_10_years()**:
   - This test ensures the price calculation for a red "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 10 years old. The expected price is 1.75.

### 8. **calculatePriceForMagicCards_green_20_years()**:
   - This test validates the price calculation for a green "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 20 years old. The expected price is 5.28.

### 9. **calculatePriceForMagicCards_black_20_years()**:
   - This test verifies the price calculation for a black "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 20 years old. The expected price is 8.16.

### 10. **calculatePriceForWine()**:
    - This test checks the price calculation for a wine product named "el tio juanillo" that is 10 years old. The expected price is 200.0.

### 11. **calculatePriceForCheese()**:
    - This test ensures the price calculation for a cheese product named "French Camembert" that is 5 years old and has a stinky status. The expected price is 50.0.

### 12. **calculatePriceForFish_blue()**:
    - This test validates the price calculation for a blue fish with a base price of 1.0. The expected price is 1.10.

### 13. **calculatePriceForFish_gold()**:
    - This test verifies the price calculation for a gold fish with a base price of 1.0. The expected price is 100.0.

### 14. **calculatePriceForFish_default()**:
    - This test checks the price calculation for a fish with a default color (other) with a base price of 0.0. The expected price is 0.0.

### 15. **calculatePriceFor_Black_Lotus()**:
    - This test ensures the price calculation for a card named "Magic: The Gathering - Black Lotus". The expected price is 40000.0.

### 16. **calculatePriceFor_animals_terrestrial()**:
    - This test validates the price calculation for a terrestrial animal with 4 legs. The expected price is 16.8.

### 17. **calculatePriceFor_chocolate()**:
    - This test verifies the price calculation for a chocolate product with a base price of 1.0 and color black. The expected price is 1.0.

### 18. **calculatePriceFor_spider_gold_Stinky()**:
    - This test checks the price calculation for a gold spider with 8 legs and a stinky status. The expected price is 6.3.

### 19. **calculatePriceFor_spider_red_Stinky()**:
    - This test ensures the price calculation for a red spider with 8 legs and a stinky status. The expected price is 5.8.
### 20. **calculatePriceFor_spider_default_Stinky()**:
    - This test validates the price calculation for a spider with a default color (blue) with 8 legs and a stinky status. The expected price is 4.8.
### 21. **calculatePriceFor_spider_gold_is_not_Stinky()**:
    - This test verifies the price calculation for a gold spider with 8 legs and not stinky. The expected price is 12.6.
### 22. **calculatePriceFor_spider_red_is_not_Stinky()**:
    - This test checks the price calculation for a red spider with 8 legs and not stinky. The expected price is 11.6.
### 23. **calculatePriceFor_spider_default_is_not_Stinky()**:
    - This test ensures the price calculation for a spider with a default color (blue) with 8 legs and not stinky. The expected price is 9.6.

