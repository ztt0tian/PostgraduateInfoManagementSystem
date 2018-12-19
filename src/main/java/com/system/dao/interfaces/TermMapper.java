package com.system.dao.interfaces;

import com.system.model.Term;
import com.system.model.TermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TermMapper {
    long countByExample(TermExample example);

    int deleteByExample(TermExample example);

    int deleteByPrimaryKey(Integer term_id);

    int insert(Term record);

    int insertSelective(Term record);

    List<Term> selectByExample(TermExample example);

    Term selectByPrimaryKey(Integer term_id);

    int updateByExampleSelective(@Param("record") Term record, @Param("example") TermExample example);

    int updateByExample(@Param("record") Term record, @Param("example") TermExample example);

    int updateByPrimaryKeySelective(Term record);

    int updateByPrimaryKey(Term record);
}