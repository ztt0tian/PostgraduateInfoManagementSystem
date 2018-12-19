package com.system.services.impl;

import com.system.dao.interfaces.SpecialtyMapper;
import com.system.model.Specialty;
import com.system.model.SpecialtyExample;
import com.system.services.interfaces.ISpecialtyService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpecialtyServiceImpl implements ISpecialtyService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int inserSpecialty(Specialty specialty) {
        return sqlSessionFactory.openSession().getMapper(SpecialtyMapper.class).insertSelective(specialty);
    }

    public List<Specialty> selectSpecialtyByCondition(SpecialtyExample specialtyExample) {
        return sqlSessionFactory.openSession().getMapper(SpecialtyMapper.class).selectByExample(specialtyExample);
    }

    public int updateSpecialtyByExampleSelective(Specialty specialty, SpecialtyExample specialtyExample) {
        return sqlSessionFactory.openSession().getMapper(SpecialtyMapper.class).updateByExampleSelective(specialty, specialtyExample);
    }

    public int deletSpecialtyByCondition(SpecialtyExample specialtyExample) {
        return sqlSessionFactory.openSession().getMapper(SpecialtyMapper.class).deleteByExample(specialtyExample);
    }
}
