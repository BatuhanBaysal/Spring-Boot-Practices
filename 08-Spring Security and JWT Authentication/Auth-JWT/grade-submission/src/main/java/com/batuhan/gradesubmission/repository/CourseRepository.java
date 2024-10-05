package com.batuhan.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.batuhan.gradesubmission.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}