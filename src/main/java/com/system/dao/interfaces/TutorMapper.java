package com.system.dao.interfaces;

import com.system.model.Tutor;
import com.system.model.TutorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TutorMapper {
    long countByExample(TutorExample example);
    int deleteByExample(TutorExample example);
    int deleteByPrimaryKey(Integer tutor_id);
    int insert(Tutor record);
    int insertSelective(Tutor record);
    List<Tutor> selectByExample(TutorExample example);
    Tutor selectByPrimaryKey(Integer tutor_id);
    int updateByExampleSelective(@Param("record") Tutor record, @Param("example") TutorExample example);
    int updateByExample(@Param("record") Tutor record, @Param("example") TutorExample example);
    int updateByPrimaryKeySelective(Tutor record);
    int updateByPrimaryKey(Tutor record);
}