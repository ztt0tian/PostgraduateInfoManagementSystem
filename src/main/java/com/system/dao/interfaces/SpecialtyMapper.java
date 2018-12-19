package com.system.dao.interfaces;

import com.system.model.Specialty;
import com.system.model.SpecialtyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialtyMapper {
    long countByExample(SpecialtyExample example);

    int deleteByExample(SpecialtyExample example);

    int deleteByPrimaryKey(Integer specialty_id);

    int insert(Specialty record);

    int insertSelective(Specialty record);

    List<Specialty> selectByExample(SpecialtyExample example);

    Specialty selectByPrimaryKey(Integer specialty_id);

    int updateByExampleSelective(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    int updateByExample(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    int updateByPrimaryKeySelective(Specialty record);

    int updateByPrimaryKey(Specialty record);
}