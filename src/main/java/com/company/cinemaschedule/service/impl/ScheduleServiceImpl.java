package com.company.cinemaschedule.service.impl;

import com.company.cinemaschedule.config.ModelMapperConfiguration;
import com.company.cinemaschedule.data.dto.request.ScheduleRequestDto;
import com.company.cinemaschedule.data.dto.response.ScheduleResponseDto;
import com.company.cinemaschedule.data.entity.Schedule;
import com.company.cinemaschedule.data.repository.ScheduleRepository;
import com.company.cinemaschedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public void save(ScheduleRequestDto scheduleRequestDto) {
        scheduleRepository.save(ModelMapperConfiguration.map(scheduleRequestDto, Schedule.class));
    }

    @Override
    public List<ScheduleResponseDto> getAll() {
        return scheduleRepository.findAll().stream().map(schedule -> ModelMapperConfiguration.map(schedule,ScheduleResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public void updateSchedule(Long id, ScheduleRequestDto scheduleRequestDto) {
        Schedule schedule = scheduleRepository.findScheduleById(id);
        Schedule updatedShecdule = ModelMapperConfiguration.map(scheduleRequestDto, schedule);
        scheduleRepository.save(updatedShecdule);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
