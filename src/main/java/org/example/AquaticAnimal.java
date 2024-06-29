package org.example;

public class AquaticAnimal {

    private String color;

    public AquaticAnimal(String color, double basePrice) {
        this.color = color;
        this.basePrice = basePrice;
    }

    private double basePrice;

    public double getBasePrice() {
        return basePrice;
    }


    public String getColor() {
        return color;
    }

    public double calculatePrice() {
        return switch (this.getColor()) {
            case "blue" -> this.getBasePrice()  +0.1;
            case "gold" -> this.getBasePrice() *100.0;
            default -> this.getBasePrice();
        };
    }
}
