package org.example;

public class TerrestrialAnimal {
  private int numberOfLegs;
  private String color;
  private boolean isStinky;
  private String name;

  public TerrestrialAnimal(int numberOfLegs, String color, boolean isStinky, String name) {
    this.numberOfLegs = numberOfLegs;
    this.color = color;
    this.isStinky = isStinky;
    this.name = name;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public String getColor() {
    return color;
  }

  public boolean isStinky() {
    return isStinky;
  }

  public String getName() {
    return name;
  }

  public double calculatePrice() {
    if (this.getName().equals("Spider")) {
      if (this.isStinky() && this.getColor().equals("Red")) {
        return ((this.getNumberOfLegs() * 1.2) + 2) / 2;
      }
      if (this.isStinky() && this.getColor().equals("Gold")) {
        return ((this.getNumberOfLegs() * 1.2) + 3) / 2;
      }
      if (this.getColor().equals("Red")) {
        return (this.getNumberOfLegs() * 1.2) + 2;
      }
      if (this.getColor().equals("Gold")) {
        return (this.getNumberOfLegs() * 1.2) + 3;
      }
      if (this.isStinky()) {
        return (this.getNumberOfLegs() * 1.2) / 2;
      }
    }
    if (this.getName().equals("Spider")) {
      return this.getNumberOfLegs() * 1.2;
    }
    if (this.getNumberOfLegs() != 0) {
      return this.getNumberOfLegs() * 4.2;
    }

    return 0;
    }
  }


