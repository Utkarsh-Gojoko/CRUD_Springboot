package com.example.crud.controllers;

import com.example.crud.entities.Course;
import com.example.crud.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {
    @Autowired
    private CourseService courseservice;

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseservice.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCoursebyId(@PathVariable String courseId ){
        return this.courseservice.getCoursebyId(Long.parseLong(courseId));
    }
//
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
      return this.courseservice.addCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.courseservice.deleteCourses(Long.parseLong(courseId));
    }
}
