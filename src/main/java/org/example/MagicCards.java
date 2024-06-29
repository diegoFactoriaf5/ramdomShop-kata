package org.example;

public class MagicCards {
  private String name;
  private String color;
  private boolean tenCardYears;
  private boolean twentyCardYears;

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public boolean isTenCardYears() {
        return tenCardYears;
    }

    public boolean isTwentyCardYears() {
        return twentyCardYears;
    }

  public MagicCards(String name, String color, boolean tenCardYears, boolean twentyCardYears) {
    this.name = name;
    this.color = color;
    this.tenCardYears = tenCardYears;
    this.twentyCardYears = twentyCardYears;
  }
    public double calculatePrice() {
        if (this.getName().equals("Magic: The Gathering - Black Lotus")) {
            return 40000.0;
        } else if (this.getName().startsWith("Magic: The Gathering")) {
            return switch (this.getColor()) {
                case "blue" -> {
                    if (!tenCardYears) {
                        yield 5.0;
                    } else {
                        yield 5.0/2;
                    }
                }
                case "red" -> {
                    if (!tenCardYears) {
                        yield 3.5;
                    } else {
                        yield 3.5/2;
                    }
                }
                case "green" -> {
                    if (!twentyCardYears) {
                        yield 4.4;
                    } else {
                        yield 4.4*1.2;
                    }
                }
                case "black" -> {
                    if (!twentyCardYears) {
                        yield 6.8;
                    } else {
                        yield 6.8*1.2;
                    }
                }
                default -> 2.0;
            };
        }
        return 0;
    }
}


