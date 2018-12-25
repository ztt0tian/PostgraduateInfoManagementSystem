package com.system.services.impl;

import com.system.dao.interfaces.TermMapper;
import com.system.model.Term;
import com.system.model.TermExample;
import com.system.services.interfaces.ITermSerivice;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TermSeriviceImpl implements ITermSerivice {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int insertTerm(Term term) {
        return sqlSessionFactory.openSession().getMapper(TermMapper.class).insertSelective(term);
    }
    public List<Term> selectTermByCondition(TermExample example) {
        return sqlSessionFactory.openSession().getMapper(TermMapper.class).selectByExample(example);
    }

    public int deleteTermByPK(int term_id) {
        return sqlSessionFactory.openSession().getMapper(TermMapper.class).deleteByPrimaryKey(term_id);
    }

    public Term selectTermByPK(int term_id) {
        return sqlSessionFactory.openSession().getMapper(TermMapper.class).selectByPrimaryKey(term_id);
    }

}
