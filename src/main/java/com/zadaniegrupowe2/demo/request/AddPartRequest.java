package com.zadaniegrupowe2.demo.request;

public class AddPartRequest {
    private String name;
    private double price;
    private String vehicleType;

    public AddPartRequest(String name, double price, String vehicleType) {
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

    public String getVehicleType() {
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
