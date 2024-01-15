package be.nadira;

import java.util.ArrayList;
import java.util.List;

public class ShoePair {

    private String brand;
    private boolean complete;
    private String color;
    private int size;
    private double price;

    public ShoePair(String brand, boolean complete, String color, int size, double price) {
        this.brand = brand;
        this.complete = complete;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoePair{" +
                "brand='" + brand + '\'' +
                ", complete=" + complete +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

}