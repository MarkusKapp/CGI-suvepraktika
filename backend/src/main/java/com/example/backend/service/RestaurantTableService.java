package com.example.backend.service;

import com.example.backend.controller.tables.RestaurantTableResponseDto;
import com.example.backend.mapper.RestaurantTableMapper;
import com.example.backend.repository.RestaurantTableRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RestaurantTableService {
    private final RestaurantTableRepository restaurantTableRepository;

    public List<RestaurantTableResponseDto> getAllTables() {
        var tables = restaurantTableRepository.findAll();
        return restaurantTableRepository.findAll()
                .stream()
                .map(RestaurantTableMapper::toDto)
                .toList();
    }
}
