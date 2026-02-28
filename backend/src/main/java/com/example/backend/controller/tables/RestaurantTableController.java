package com.example.backend.controller.tables;

import com.example.backend.service.RestaurantTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class RestaurantTableController {
    private final RestaurantTableService restaurantTableService;

    @GetMapping("public/tables")
    public List<RestaurantTableResponseDto> getAllTables() {
        return restaurantTableService.getAllTables();
    }
}
