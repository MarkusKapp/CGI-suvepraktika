package com.example.backend.mapper;

import com.example.backend.controller.tables.RestaurantTableDto;
import com.example.backend.controller.tables.RestaurantTableResponseDto;
import com.example.backend.entity.RestaurantTable;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface RestaurantTableMapper {
    RestaurantTable mapToTable(RestaurantTableDto restaurantTableDto);
    RestaurantTableResponseDto toDto(RestaurantTable table);

}
