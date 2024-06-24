package org.example;

import java.math.BigDecimal;

public interface IProduct {
        Integer numberOfLegs();
        Integer age();
        boolean isStinky();
        String color();
        BigDecimal basePrice();
        String name();
        boolean tenCardYears();
        boolean twentyCardYears();
        BigDecimal calculateProductPrice();

}
