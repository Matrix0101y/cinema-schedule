package com.company.cinemaschedule.data.dto.response;

import lombok.Data;

@Data
public class ScheduleResponseDto {

    private String cinema;
    private String hall;
    private String film;
    private double price;
}
