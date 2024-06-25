package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
  }

  public Double getTotalPrice() {
    return products.stream()
        .map(this::calculatePrice)
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .doubleValue();
  }

  private BigDecimal calculatePrice(Product product) {
    if (product.getBasePrice() != null) {
      return fishPrice(product);
    } else if (product.getName().startsWith("Magic: The Gathering")) {
      return cardPrice(product);
    }
    return product.getSellPrice();
  }

  public BigDecimal fishPrice(Product product) {
    return switch (product.getColor()) {
      case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
      case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
      default -> product.getBasePrice();
    };
  }

  public BigDecimal cardPrice(Product product) {
    if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
      return BigDecimal.valueOf(40000.0);
    } else if (product.getName().startsWith("Magic: The Gathering")) {
      return switch (product.getColor()) {
        case "blue" -> {
          boolean tenCardYears = product.tenCardYears();
          if (!tenCardYears) {
            yield BigDecimal.valueOf(5.0);
          } else {
            yield BigDecimal.valueOf(5.0).divide(BigDecimal.valueOf(2));
          }
        }
        case "red" -> {
          boolean tenCardYears = product.tenCardYears();
          if (!tenCardYears) {
            yield BigDecimal.valueOf(3.5);
          } else {
            yield BigDecimal.valueOf(3.5).divide(BigDecimal.valueOf(2));
          }
        }
        case "green" -> {
          boolean twentyCardYears = product.twentyCardYears();
          if (!twentyCardYears) {
            yield BigDecimal.valueOf(4.4);
          } else {
            yield BigDecimal.valueOf(4.4).multiply(BigDecimal.valueOf(1.2));
          }
        }
        case "black" -> {
          boolean twentyCardYears = product.twentyCardYears();
          if (!twentyCardYears) {
            yield BigDecimal.valueOf(6.8);
          } else {
            yield BigDecimal.valueOf(6.8).multiply(BigDecimal.valueOf(1.2));
          }
        }
        default -> BigDecimal.valueOf(2.0);
      };
    }
    return product.getSellPrice();
  }
}