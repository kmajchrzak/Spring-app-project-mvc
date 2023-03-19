package com.zadaniegrupowe2.demo.entity;

import jakarta.persistence.*;

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
}
