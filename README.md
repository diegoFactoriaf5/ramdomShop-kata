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

The `ShoppingCartTest` class verifies the functionality of the shopping cart. Here is a brief overview of the key tests:

1. **Magic: The Gathering Cards**: Tests various scenarios for calculating prices of cards based on color, age, and type.
2. **Wine and Cheese**: Validates price calculations for gourmet products, including the effect of age and stinky status.
3. **Fish**: Ensures correct pricing for fish based on color.
4. **Black Lotus Card**: Confirms the high price for the rare "Magic: The Gathering - Black Lotus" card.
5. **Terrestrial Animals**: Checks the price for animals with legs.
6. **Chocolate**: Verifies the price calculation for chocolate.
7. **Spiders**: Tests the pricing for spiders, considering their color, leg count, and stinky status.

## Conclusion

This project demonstrates a robust approach to managing a shopping cart with diverse product types, each having unique pricing criteria. The comprehensive tests ensure that all edge cases and scenarios are covered, guaranteeing accurate price calculations for any product added to the cart.
