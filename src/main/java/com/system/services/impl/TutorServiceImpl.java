package com.system.services.impl;

import com.system.dao.interfaces.TutorMapper;
import com.system.model.Tutor;
import com.system.model.TutorExample;
import com.system.services.interfaces.ITutorService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TutorServiceImpl implements ITutorService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int inserTutor(Tutor tutor) {
        return sqlSessionFactory.openSession().getMapper(TutorMapper.class).insertSelective(tutor);
    }

    public List<Tutor> selectByCondition(TutorExample tutorExample) {
        return sqlSessionFactory.openSession().getMapper(TutorMapper.class).selectByExample(tutorExample);
    }

    public int updateTutorByExampleSelective(Tutor tutor, TutorExample example) {
        return sqlSessionFactory.openSession().getMapper(TutorMapper.class).updateByExampleSelective(tutor,example);
    }

    public int deletTutorByCondition(TutorExample tutorExample) {
        return sqlSessionFactory.openSession().getMapper(TutorMapper.class).deleteByExample(tutorExample);
    }
}
