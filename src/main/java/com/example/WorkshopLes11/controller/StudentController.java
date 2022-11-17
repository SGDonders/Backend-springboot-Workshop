package com.example.WorkshopLes11.controller;


import com.example.WorkshopLes11.model.Student;
import com.example.WorkshopLes11.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repos;

    @GetMapping
    public ResponseEntity<Iterable<Student>> getStudent() {
        return ResponseEntity.ok(repos.findAll());
    }



}
