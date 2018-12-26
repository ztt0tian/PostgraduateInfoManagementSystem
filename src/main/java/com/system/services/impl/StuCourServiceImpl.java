package com.system.services.impl;

import com.system.dao.interfaces.StuCourRMapper;
import com.system.model.Course;
import com.system.model.StuCourRExample;
import com.system.model.StuCourRKey;
import com.system.services.interfaces.ICourseService;
import com.system.services.interfaces.IStuCourService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StuCourServiceImpl implements IStuCourService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private StuCourRExample example;
    @Autowired
    private ICourseService courseService;
    public List<Course> selectAllCourseOfone(Integer student_id) {
        example.clear();
        List<Course> courses = new ArrayList<Course>();
        List<StuCourRKey> stuCourRKeys=sqlSessionFactory.openSession().getMapper(StuCourRMapper.class).selectByExample(example);
        for (StuCourRKey s:stuCourRKeys
             ) {
            courses.add(courseService.selectCourseByPK(s.getCourse_id()));
        }
        return courses;
    }

    public int insertStuCourRecord(StuCourRKey stuCourRKey) {
        return sqlSessionFactory.openSession().getMapper(StuCourRMapper.class).insertSelective(stuCourRKey);
    }
}
