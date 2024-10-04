package com.batuhan.gradesubmission.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.batuhan.gradesubmission.entity.Course;
import com.batuhan.gradesubmission.entity.Student;
import com.batuhan.gradesubmission.exception.CourseNotFoundException;
import com.batuhan.gradesubmission.repository.CourseRepository;
import com.batuhan.gradesubmission.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    CourseRepository courseRepository;
    StudentRepository studentRepository;

    @Override
    public Course getCourse(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return unwrapCourse(course, id);
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {       
        courseRepository.deleteById(id); 
    }

    @Override
    public List<Course> getCourses() {
        return (List<Course>)courseRepository.findAll();
    }

    static Course unwrapCourse(Optional<Course> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new CourseNotFoundException(id);
    }

    @Override
    public Course addStudentToCourse(Long studentId, Long courseId) {
        Course course = getCourse(courseId);
        Optional<Student> student = studentRepository.findById(studentId);
        Student unwrapStudent = StudentServiceImpl.unwrapStudent(student, studentId);
        course.getStudents().add(unwrapStudent);
        return courseRepository.save(course);
    }

    @Override
    public Set<Student> getEnrolledStudents(Long id) {
        Course course = getCourse(id);
        return course.getStudents();
    }
}