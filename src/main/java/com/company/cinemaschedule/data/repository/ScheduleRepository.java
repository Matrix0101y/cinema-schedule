package com.company.cinemaschedule.data.repository;

import com.company.cinemaschedule.data.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Schedule findScheduleById(Long id);
}
