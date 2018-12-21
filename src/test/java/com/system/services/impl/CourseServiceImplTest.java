package com.system.services.impl;

import com.system.model.Course;
import com.system.model.CourseExample;
import com.system.services.interfaces.ICourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mvc.xml","classpath:/config/spring-mybatis.xml"})
public class CourseServiceImplTest {
    @Autowired
    private ICourseService courseService;
    @Autowired
    private CourseExample courseExample;

    @Test
    public void insertCourse() throws ParseException {
        Course course = new Course();
        course.setCourse_id(1234);
        course.setCourse_name("计算机技术");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date d = format.parse("14:00:00");
        course.setCourse_start_time(new Time(d.getTime()));
        courseService.insertCourse(course);
    }

    @Test
    public void selectCourseByCondition() {

    }

    @Test
    public void selectCourseByPK() {
        Course course = courseService.selectCourseByPK(123456);
        System.out.println(course.getCourse_start_time());
    }

    @Test
    public void updateCourseByExampleSelective() {
    }

    @Test
    public void deletCourseByCondition() {
    }
}