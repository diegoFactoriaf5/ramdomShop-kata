package org.example;

import java.math.BigDecimal;
import java.util.PrimitiveIterator;

public class TerrestrialAnimal implements IProduct {
    public TerrestrialAnimal(BigDecimal numberOfLegs, String color, boolean isStinky, String name) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isStinky = isStinky;
        this.name = name;
    }



    private BigDecimal numberOfLegs;
     private String color;
     private boolean isStinky;
     private String name;

    @Override
    public Integer numberOfLegs() {
        return 0;
    }

    @Override
    public Integer age() {
        return 0;
    }

    @Override
    public boolean isStinky() {
        return false;
    }

    @Override
    public String color() {
        return "";
    }

    @Override
    public BigDecimal basePrice() {
        return null;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public boolean tenCardYears() {
        return false;
    }

    @Override
    public boolean twentyCardYears() {
        return false;
    }

    @Override
    public BigDecimal calculateProductPrice() {
        return null;
    }
}
