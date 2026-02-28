package com.example.backend.repository;

import com.example.backend.entity.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Integer> {
}
