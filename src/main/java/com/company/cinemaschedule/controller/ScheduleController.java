package com.company.cinemaschedule.controller;

import com.company.cinemaschedule.data.dto.request.ScheduleRequestDto;
import com.company.cinemaschedule.data.dto.response.ScheduleResponseDto;
import com.company.cinemaschedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.company.cinemaschedule.enums.MessageCase.*;
import static com.company.cinemaschedule.enums.MessageCase.EMPLOYEE_CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody ScheduleRequestDto scheduleRequestDto) {
        scheduleService.save(scheduleRequestDto);
        return new ResponseEntity<>(EMPLOYEE_CREATED.getMessage(), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> getAll() {
        return ResponseEntity.ok(scheduleService.getAll());
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<String> updateSchedule(@PathVariable("id") Long id, @RequestBody ScheduleRequestDto scheduleRequestDto) {
        scheduleService.updateSchedule(id, scheduleRequestDto);
        return new ResponseEntity<>(EMPLOYEE_UPDATED.getMessage(), HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> deleteSchedule(@PathVariable("id") Long id) {
        scheduleService.deleteSchedule(id);
        return new ResponseEntity<>(EMPLOYEE_DELETED.getMessage(), HttpStatus.OK);
    }
}
