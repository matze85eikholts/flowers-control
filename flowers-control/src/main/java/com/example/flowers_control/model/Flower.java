package com.example.flowers_control.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int wateringFrequency;

    @Column(nullable = false)
    private String soilType;

}
