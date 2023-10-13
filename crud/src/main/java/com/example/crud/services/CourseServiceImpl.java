package com.example.crud.services;

//import com.example.crud.dao.CourseDao;
import com.example.crud.dao.CourseRepository;
import com.example.crud.entities.Course;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@AllArgsConstructor
public class CourseServiceImpl implements CourseService {


    private  CourseRepository coursedao;

//    List<Course> list;
//    public CourseServiceImpl(){
//
//        list = new ArrayList<>();
//        list.add(new Course("Java Course",112,"this is a java course"));
//        list.add(new Course("DevOps Course",652,"this is a Devops course"));
//
//    }



    @Override
    public List<Course> getCourses(){

        return coursedao.findAll();
    }

    @Override
    public Course getCoursebyId(Long courseId) {
//        Course c=null;
//        for (Course course:list) {
//            if(course.getCourseId()==courseId){
//                c=course;
//            }
//        }

        var opt = coursedao.findById(courseId);
        return opt.get();
    }
//
    @Override
    public Course addCourse(Course course) {
//       list.add(course);
        coursedao.save(course);
        return course;
    }

    @Override
    public Course deleteCourses(Long courseId) {
        var entity = coursedao.findById(courseId);
        coursedao.delete(entity.get());
        return null;
    }


}
