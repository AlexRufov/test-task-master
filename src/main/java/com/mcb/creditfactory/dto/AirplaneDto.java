package com.mcb.creditfactory.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("airplane")
public class AirplaneDto implements Collateral{
    private Long id;
    private String brand;
    private String model;
    private String manufacturer;
    private Short year;
    private Long fuelCapacity;
    private Long seats;
    private LocalDate evaluationDate;
    private BigDecimal value;
}
