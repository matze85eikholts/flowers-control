package com.example.flowers_control.model;
import jakarta.persistence.*;

@Entity
@Table(name = "room_flowers")
public class RoomFlower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "flower_id", nullable = false)
    private Flower flower;

    // Конструктор по умолчанию
    public RoomFlower() {
    }

    // Конструктор со всеми полями
    public RoomFlower(Room room, Flower flower) {
        this.room = room;
        this.flower = flower;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    // Метод toString
    @Override
    public String toString() {
        return "RoomFlower{" +
                "id=" + id +
                ", room=" + (room != null ? room.getName() : "null") +
                ", flower=" + (flower != null ? flower.getName() : "null") +
                '}';
    }
}

