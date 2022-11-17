package com.example.WorkshopLes11.repository;

import com.example.WorkshopLes11.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.time.LocalDate;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
   public Iterable<Teacher> findByDobAfter(LocalDate date);



}
