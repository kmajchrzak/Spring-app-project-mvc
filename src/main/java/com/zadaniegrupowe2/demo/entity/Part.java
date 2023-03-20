package com.zadaniegrupowe2.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @Enumerated(value = EnumType.STRING)
    private PartType type;

    public Part(String name, double price, PartType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Part() {
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public PartType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return id == part.id && Double.compare(part.price, price) == 0 && Objects.equals(name, part.name) && type == part.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, type);
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
