package com.system.services.interfaces;


import com.system.model.Course;
import com.system.model.StuCourRKey;

import java.util.List;

public interface IStuCourService {
    List<Course> selectAllCourseOfone(Integer student_id);

    int insertStuCourRecord(StuCourRKey stuCourRKey);
}
