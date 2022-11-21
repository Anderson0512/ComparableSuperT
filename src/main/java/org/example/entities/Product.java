package org.example.entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Product others) {
        return price.compareTo(others.getPrice());
    }

    @Override
    public String toString() {
        return "Product " + name + ", price " + String.format("%.2f",price);
    }
}
