package org.example;

public class GourmetProduct {
    private Integer age;
    private boolean isStinky;

    public boolean isStinky() {
        return isStinky;
    }

    public Integer getAge() {
        return age;
    }

    public GourmetProduct(Integer age, boolean isStinky) {
        this.age = age;
        this.isStinky = isStinky;
    }
public double calculatePrice() {
        if (this.isStinky()){
            return 10.0 * this.getAge();
        }
            return 20.0 * this.getAge();
    }

}
