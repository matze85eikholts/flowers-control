package com.example.flowers_control.repository;


import com.example.flowers_control.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {


}


