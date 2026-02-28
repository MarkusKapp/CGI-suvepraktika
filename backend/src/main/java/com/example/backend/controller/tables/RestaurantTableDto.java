package com.example.backend.controller.tables;

import com.example.backend.Zone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantTableDto {
    private Long id;
    private int capacity;
    private Zone zone;
    private int xPosition;
    private int yPosition;
    private boolean hasWindow;
    private boolean isQuiet;
    private boolean isAccessible;
    private boolean nearWc;
    private boolean nearPlayground;
}
