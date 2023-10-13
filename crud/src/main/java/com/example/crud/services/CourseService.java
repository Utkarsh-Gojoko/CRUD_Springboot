package com.example.crud.services;

import com.example.crud.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCoursebyId(Long courseId);
    public Course addCourse(Course course);
    public Course deleteCourses(Long courseId);
}
