package com.example.flowers_control.model;
import jakarta.persistence.*;

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
    // Конструктор по умолчанию
    public Flower() {
    }

    // Конструктор со всеми полями
    public Flower(String name, int wateringFrequency, String soilType) {
        this.name = name;
        this.wateringFrequency = wateringFrequency;
        this.soilType = soilType;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(int wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    // Метод toString
    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wateringFrequency=" + wateringFrequency +
                ", soilType='" + soilType + '\'' +
                '}';
    }
}
