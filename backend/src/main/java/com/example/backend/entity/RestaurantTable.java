package com.example.backend.entity;

import com.example.backend.Zone;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tables")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int capacity;
    @Enumerated(EnumType.STRING)
    private Zone zone;
    private int xPosition;
    private int yPosition;

    private boolean hasWindow;
    private boolean isQuiet;
    private boolean isAccessible;
    private boolean nearWc;
    private boolean nearPlayground;
}