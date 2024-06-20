package org.example;

import java.math.BigDecimal;

public class Product {
    private final Integer numberOfLegs;
    private final Integer age;
    private final boolean isStinky;
    private final String color;
    private final BigDecimal basePrice;
    private final String name;
    private final BigDecimal sellPrice;
    private final boolean isSpider;



    public Product(Integer numberOfLegs, Integer age, boolean isStinky, String color, BigDecimal basePrice, String name, BigDecimal sellPrice, boolean isSpider) {
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.isStinky = isStinky;
        this.color = color;
        this.basePrice = basePrice;
        this.name = name;
        this.sellPrice = sellPrice;
        this.isSpider = isSpider;

    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public boolean isSpider() {
        return isSpider;
    }
}
