package com.example.flowers_control.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

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

}
