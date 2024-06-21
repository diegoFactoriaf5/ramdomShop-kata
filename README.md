# ShoppingCart Project

This program allows adding various products to the cart and calculates the total price based on specific criteria for different product types.

## Package Structure

The project consists of two main classes:

1. **ShoppingCart**: This class represents the shopping cart where products can be added, and it provides functionality to calculate the total price.
2. **Product**: This class represents a product with various attributes like number of legs, age, stinky status, color, base price, name, and sell price.

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

Below is the description of each test in the `ShoppingCartTest` class:

### 1. **calculatePriceForMagicCards_red()**
   - Verifies the price calculation for a red "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". Expected price: 3.5.

### 2. **calculatePriceForMagicCards_blue()**
   - Checks the price calculation for a blue "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal". Expected price: 5.0.

### 3. **calculatePriceForMagicCards_green()**
   - Ensures the price calculation for a green "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". Expected price: 4.4.

### 4. **calculatePriceForMagicCards_black()**
   - Validates the price calculation for a black "Magic: The Gathering" card named "Magic: The Gathering - Lightning Bolt". Expected price: 6.8.

### 5. **calculatePriceForMagicCards_default()**
   - Confirms the price calculation for a "Magic: The Gathering" card with a default color (brown) named "Magic: The Gathering - Lightning Bolt". Expected price: 2.0.

### 6. **calculatePriceForMagicCards_blue_10_years()**
   - Checks the price calculation for a blue "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 10 years old. Expected price: 2.5.

### 7. **calculatePriceForMagicCards_red_10_years()**
   - Ensures the price calculation for a red "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 10 years old. Expected price: 1.75.

### 8. **calculatePriceForMagicCards_green_20_years()**
   - Validates the price calculation for a green "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 20 years old. Expected price: 5.28.

### 9. **calculatePriceForMagicCards_black_20_years()**
   - Verifies the price calculation for a black "Magic: The Gathering" card named "Magic: The Gathering - Maga Eternal" that is 20 years old. Expected price: 8.16.

### 10. **calculatePriceForWine()**
   - Checks the price calculation for a wine product named "el tio juanillo" that is 10 years old. Expected price: 200.0.

### 11. **calculatePriceForCheese()**
   - Ensures the price calculation for a cheese product named "French Camembert" that is 5 years old and has a stinky status. Expected price: 50.0.

### 12. **calculatePriceForFish_blue()**
   - Validates the price calculation for a blue fish with a base price of 1.0. Expected price: 1.10.

### 13. **calculatePriceForFish_gold()**
   - Verifies the price calculation for a gold fish with a base price of 1.0. Expected price: 100.0.

### 14. **calculatePriceForFish_default()**
   - Checks the price calculation for a fish with a default color (other) with a base price of 0.0. Expected price: 0.0.

### 15. **calculatePriceFor_Black_Lotus()**
   - Ensures the price calculation for a card named "Magic: The Gathering - Black Lotus". Expected price: 40000.0.

### 16. **calculatePriceFor_animals_terrestrial()**
   - Validates the price calculation for a terrestrial animal with 4 legs. Expected price: 16.8.

### 17. **calculatePriceFor_chocolate()**
   - Verifies the price calculation for a chocolate product with a base price of 1.0 and color black. Expected price: 1.0.

### 18. **calculatePriceFor_spider_gold_Stinky()**
   - Checks the price calculation for a gold spider with 8 legs and a stinky status. Expected price: 6.3.

### 19. **calculatePriceFor_spider_red_Stinky()**
   - Ensures the price calculation for a red spider with 8 legs and a stinky status. Expected price: 5.8.

### 20. **calculatePriceFor_spider_default_Stinky()**
   - Validates the price calculation for a spider with a default color (blue) with 8 legs and a stinky status. Expected price: 4.8.

### 21. **calculatePriceFor_spider_gold_is_not_Stinky()**
   - Verifies the price calculation for a gold spider with 8 legs and not stinky. Expected price: 12.6.

### 22. **calculatePriceFor_spider_red_is_not_Stinky()**
   - Checks the price calculation for a red spider with 8 legs and not stinky. Expected price: 11.6.

### 23. **calculatePriceFor_spider_default_is_not_Stinky()**
   - Ensures the price calculation for a spider with a default color (blue) with 8 legs and not stinky. Expected price: 9.6.
