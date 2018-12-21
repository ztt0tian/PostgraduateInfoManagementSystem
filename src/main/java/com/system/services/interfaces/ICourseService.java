package com.system.services.interfaces;

import com.system.model.Course;
import com.system.model.CourseExample;

import java.util.List;

public interface ICourseService {
    int insertCourse(Course course);
    List<Course> selectCourseByCondition(CourseExample courseExample);
    Course selectCourseByPK(Integer course_id);
    int updateCourseByExampleSelective(Course course,CourseExample courseExample);
    int deletCourseByCondition(CourseExample courseExample);
}
