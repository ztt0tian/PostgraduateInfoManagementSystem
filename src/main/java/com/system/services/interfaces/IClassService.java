package com.system.services.interfaces;


import com.system.model.Class;
import com.system.model.ClassExample;

import java.util.List;

public interface IClassService {
    int insertClass(Class cla);
    long countClassByCondition(ClassExample example);
    int deleteClassByCondition(ClassExample example);
    int deleteClassByClassId(Integer class_id);
    List<Class> selectClassesByCondition(ClassExample example);
    int insertClassSelective(Class record);
    Class selectClassByPrimaryKey(Integer class_id);
    int updateByPrimaryKey(Class record);
    int updateByExampleSelective(Class record, ClassExample example);
    int updateByExample(Class record,ClassExample example);
    int updateByPrimaryKeySelective(Class record);
}
