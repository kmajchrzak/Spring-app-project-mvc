package com.zadaniegrupowe2.demo.request;

import com.zadaniegrupowe2.demo.entity.PartType;

public class AddPartRequest {
    private String name;
    private double price;
    private PartType vehicleType;

    public AddPartRequest(String name, double price, PartType vehicleType) {
        this.name = name;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public PartType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "AddPartRequest{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
