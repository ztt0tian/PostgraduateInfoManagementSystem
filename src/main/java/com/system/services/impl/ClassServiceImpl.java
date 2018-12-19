package com.system.services.impl;

import com.system.dao.interfaces.ClassMapper;
import com.system.model.Class;
import com.system.model.ClassExample;
import com.system.services.interfaces.IClassService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("classService")
public class ClassServiceImpl implements IClassService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int insertClass(Class cla) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).insert(cla);
    }
    public long countClassByCondition(ClassExample example){
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).countByExample(example);
    }

    public int deleteClassByCondition(ClassExample example) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).deleteByExample(example);
    }
    public int deleteClassByClassId(Integer class_id) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).deleteByPrimaryKey(class_id);
    }
    public List<Class> selectClassesByCondition(ClassExample example) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).selectByExample(example);
    }

    public int insertClassSelective(Class record) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).insertSelective(record);
    }

    public Class selectClassByPrimaryKey(Integer class_id) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).selectByPrimaryKey(class_id);
    }

    public int updateByPrimaryKey(Class record) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).updateByPrimaryKey(record);
    }

    public int updateByExampleSelective(Class record, ClassExample example) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).updateByExampleSelective(record,example);
    }

    public int updateByExample(Class record, ClassExample example) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(Class record) {
        return sqlSessionFactory.openSession().getMapper(ClassMapper.class).updateByPrimaryKeySelective(record);
    }
}
