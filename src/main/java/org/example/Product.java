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
    private final boolean tenCardYears;
    private final boolean twentyCardYears;

    public Product(Integer numberOfLegs, Integer age, boolean isStinky, String color, BigDecimal basePrice, String name, BigDecimal sellPrice, boolean tenCardYears, boolean twentyCardYears) {
        this.numberOfLegs = numberOfLegs;
        this.age = age;
        this.isStinky = isStinky;
        this.color = color;
        this.basePrice = basePrice;
        this.name = name;
        this.sellPrice = sellPrice;
        this.tenCardYears = tenCardYears;
        this.twentyCardYears = twentyCardYears;
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

    public boolean tenCardYears() {
        return tenCardYears;
    }

    public boolean twentyCardYears() {
        return twentyCardYears;
    }

}
