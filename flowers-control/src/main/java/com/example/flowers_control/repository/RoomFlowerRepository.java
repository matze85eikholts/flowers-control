package com.example.flowers_control.repository;
import com.example.flowers_control.model.RoomFlower;
import org.springframework.data.jpa.repository.JpaRepository;

//--what is actually JpaRepository----
//--I should learn this information--------------------
public interface RoomFlowerRepository extends JpaRepository<RoomFlower, Long> {
}

