package com.example.WorkshopLes11.repository;

import com.example.WorkshopLes11.model.Student;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository <Student, Long> {
    public Iterable<Student> findLastNameContaining(String name);


}
