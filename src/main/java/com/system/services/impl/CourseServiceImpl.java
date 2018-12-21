package com.system.services.impl;

import com.system.dao.interfaces.CourseMapper;
import com.system.model.Course;
import com.system.model.CourseExample;
import com.system.services.interfaces.ICourseService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements ICourseService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int insertCourse(Course course) {
        return sqlSessionFactory.openSession().getMapper(CourseMapper.class).insertSelective(course);
    }
    public List<Course> selectCourseByCondition(CourseExample courseExample) {
        return sqlSessionFactory.openSession().getMapper(CourseMapper.class).selectByExample(courseExample);
    }

    public Course selectCourseByPK(Integer course_id) {
        return sqlSessionFactory.openSession().getMapper(CourseMapper.class).selectByPrimaryKey(course_id);
    }

    public int updateCourseByExampleSelective(Course course, CourseExample courseExample) {
        return sqlSessionFactory.openSession().getMapper(CourseMapper.class).updateByExample(course,courseExample);
    }

    public int deletCourseByCondition(CourseExample courseExample) {
        return sqlSessionFactory.openSession().getMapper(CourseMapper.class).deleteByExample(courseExample);
    }
}
