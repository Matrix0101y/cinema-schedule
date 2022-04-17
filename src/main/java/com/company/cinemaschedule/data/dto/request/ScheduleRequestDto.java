package com.company.cinemaschedule.data.dto.request;

import lombok.Data;

@Data
public class ScheduleRequestDto {

    private String cinema;
    private String hall;
    private String film;
    private double price;
}
