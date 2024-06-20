package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public Double getTotalPrice() {
        return  productsList.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if(calculateAnimalPrice(product) !=null) {
            return calculateAnimalPrice(product);
        }
        if (calculateNotAnimalPrice(product) !=null) {
            return calculateNotAnimalPrice(product);
        }
        return product.getSellPrice();
    }

    private static BigDecimal calculateAnimalPrice(Product product) {
        if (calculateTerrestrialPrice(product) != null) {
            return calculateTerrestrialPrice(product);
        }
        if (countSpidersPrice(product) != null) {
            return countSpidersPrice(product);
        }
        if (countFishPrice(product) != null) {
            return countFishPrice(product);
        }
        return null;
    }

    private static BigDecimal calculateNotAnimalPrice(Product product) {
        if (countGourmetPrice(product) != null) {
            return countGourmetPrice(product);
        }
        if (countLotusPrice(product) != null) {
            return countLotusPrice(product);
        }
        if(countCardsPrice(product) !=null) {
            return countCardsPrice(product);
        }
        return null;
    }

    private static BigDecimal calculateTerrestrialPrice(Product product) {
        if (product.getNumberOfLegs() != null  && !"Spiders".equals(product.getName())) {
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        }
        return null;
    }

    private static BigDecimal countSpidersPrice(Product product) {
        if (product.getNumberOfLegs() != null && product.getName().equals("Spiders")) {
                double legsPrice = product.getNumberOfLegs() * 1.20;
                return switch (product.getColor()) {
                    case "gold" -> BigDecimal.valueOf((3 + legsPrice) / divideCards(product));
                    case "red" -> BigDecimal.valueOf((2 + legsPrice) / divideCards(product));
                    default -> BigDecimal.valueOf(legsPrice / divideCards(product));
                };
            }
        return null;
    }

    private static BigDecimal countGourmetPrice(Product product) {
        if (product.getAge() != null && !product.getName().startsWith("Magic: The Gathering")) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0 * product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        }
        return null;
    }

    private static BigDecimal countFishPrice(Product product) {
        if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();
            };
        }
        return null;
    }

    private static BigDecimal countLotusPrice(Product product) {
        if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        }
        return null;
    }

    private static BigDecimal countCardsPrice(Product product) {
        if (product.getName().startsWith("Magic: The Gathering")) {
            return switch (product.getColor()) {
                case "blue" -> BigDecimal.valueOf(5.0 / divideCards(product));
                case "red" -> BigDecimal.valueOf(3.5 / divideCards(product));
                case "green" -> BigDecimal.valueOf(4.40 * calculatePercentage(product));
                case "black" -> BigDecimal.valueOf(6.80 * calculatePercentage(product));
                default -> BigDecimal.valueOf(2.0);
            };
        }
        return null;
    }

    private static double divideCards(Product product) {
        if (product.getAge() != null && product.getAge() >= 10 || product.isStinky()) {
            return 2.0;
        }
        return 1.0;
    }

    private static double calculatePercentage(Product product) {
        if(product.getAge() !=null && product.getAge() >= 20) {
                return 1.2;
        }
        return 1.0;
    }

}