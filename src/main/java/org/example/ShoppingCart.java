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
        if (product.getNumberOfLegs() != null) {
            if(product.getName() != null) {
                if (product.getName().equals("Spiders")) {
                    double priceOflegs = product.getNumberOfLegs() * 1.20;
                    double multiplic;
                    if (product.isStinky()) {
                        multiplic = 0.5;
                    } else {
                        multiplic = 1;
                    }
                    return switch (product.getColor()) {
                        case "gold" -> BigDecimal.valueOf((3 + priceOflegs) * multiplic);
                        case "red" -> BigDecimal.valueOf((2 + priceOflegs) * multiplic);
                        default -> BigDecimal.valueOf(priceOflegs * multiplic);
                    };
                }
            }
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        } else if (product.getAge() != null && !product.getName().startsWith("Magic: The Gathering")) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0* product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();
            };
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            double blueRed = 1;
            double blackGreen = 1;
            if (product.getAge() != null) {
                if (product.getAge() >= 10) {
                    blueRed = 2;
                }
                if (product.getAge() >= 20) {
                    blackGreen = 1.2;
                }
            }
            return switch (product.getColor()) {
                case "blue" -> BigDecimal.valueOf(5.0 / blueRed);
                case "red" -> BigDecimal.valueOf(3.5 / blueRed);
                case "green" -> BigDecimal.valueOf(4.40 * blackGreen);
                case "black" -> BigDecimal.valueOf(6.80 * blackGreen);
                default -> BigDecimal.valueOf(2.0);
            };
        } else {
            return product.getSellPrice();
        }
    }

}