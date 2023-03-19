package com.zadaniegrupowe2.demo.response;

import com.zadaniegrupowe2.demo.entity.PartType;

import java.util.Objects;

public class PartResponse {
    private String name;
    private double price;
    private PartType type;

    public PartResponse(String name, double price, PartType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PartType getType() {
        return type;
    }

    public void setType(PartType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartResponse that = (PartResponse) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type);
    }

    @Override
    public String toString() {
        return "PartResponse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
