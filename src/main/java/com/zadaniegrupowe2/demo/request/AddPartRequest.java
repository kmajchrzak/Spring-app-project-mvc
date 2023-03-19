package com.zadaniegrupowe2.demo.request;

import com.zadaniegrupowe2.demo.entity.PartType;

public class AddPartRequest {
    private String name;
    private double price;
    private PartType partType;

    public AddPartRequest(String name, double price, PartType partType) {
        this.name = name;
        this.price = price;
        this.partType = partType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public PartType getType() {
        return partType;
    }

    @Override
    public String toString() {
        return "AddPartRequest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", partType='" + partType + '\'' +
                '}';
    }
}
