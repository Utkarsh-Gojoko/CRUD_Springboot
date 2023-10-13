package com.example.crud.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {

    private String courseName;
    private String courseDesc;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CourseId;

//    public Course(String courseName, Long courseId, String courseDesc) {
//        CourseName = courseName;
//        CourseId = courseId;
//        CourseDesc = courseDesc;
//    }
//
//    public String getCourseName() {
//        return CourseName;
//    }
//
//    public void setCourseName(String courseName) {
//        CourseName = courseName;
//    }
//
//
//    public Long getCourseId() {
//        return CourseId;
//    }
//
//    public void setCourseId(Long courseId) {
//        CourseId = courseId;
//    }
//
//    public String getCourseDesc() {
//        return CourseDesc;
//    }
//
//    public void setCourseDesc(String courseDesc) {
//        CourseDesc = courseDesc;
//    }
//
//    public Course(){
//
//        super();
//    }
//
//    @Override
//    public String toString() {
//        return "Course{" +
//                "CourseName='" + CourseName + '\'' +
//                ", CourseId=" + CourseId +
//                ", CourseDesc='" + CourseDesc + '\'' +
//                '}';
//    }
}
