package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
  }
  }



