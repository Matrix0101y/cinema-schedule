package com.company.cinemaschedule.service;

import com.company.cinemaschedule.data.dto.request.ScheduleRequestDto;
import com.company.cinemaschedule.data.dto.response.ScheduleResponseDto;

import java.util.List;

public interface ScheduleService {
    void save(ScheduleRequestDto scheduleRequestDto);

    List<ScheduleResponseDto> getAll();

    void updateSchedule(Long id, ScheduleRequestDto scheduleRequestDto);

    void deleteSchedule(Long id);
}
