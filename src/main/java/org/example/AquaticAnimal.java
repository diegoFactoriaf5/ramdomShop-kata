package org.example;

import java.math.BigDecimal;

public class AquaticAnimal {

    private String color;
    private BigDecimal totalPrice = null;

    public AquaticAnimal() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal fishPrice(Product product) {
        return switch (product.getColor()) {
            case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
            case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
            default -> product.getBasePrice();
        };
    }

    public void addProduct(Product product) {
    }

    public short getTotalPrice() {
        return 100;
    }
}
