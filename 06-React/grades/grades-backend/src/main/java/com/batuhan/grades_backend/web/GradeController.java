package com.batuhan.grades_backend.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batuhan.grades_backend.pojo.Grade;

@RestController
@CrossOrigin(origins = "*") 
public class GradeController {
    
    List<Grade> list = Arrays.asList(
        new Grade("Batuhan", "Math", "C"),
        new Grade("Veli", "Chemistry", "A-"),
        new Grade("Pinar", "Physics", "B+")
        );

    @GetMapping("/grades")
    public ResponseEntity<List<Grade>> getGrades() {
        return new ResponseEntity<List<Grade>>(list, HttpStatus.OK);
    }
}