package com.batuhan.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.batuhan.gradesubmission.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}