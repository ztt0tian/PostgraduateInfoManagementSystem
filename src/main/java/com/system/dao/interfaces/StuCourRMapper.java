package com.system.dao.interfaces;

import com.system.model.StuCourRExample;
import com.system.model.StuCourRKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuCourRMapper {
    long countByExample(StuCourRExample example);

    int deleteByExample(StuCourRExample example);

    int deleteByPrimaryKey(StuCourRKey key);

    int insert(StuCourRKey record);

    int insertSelective(StuCourRKey record);

    List<StuCourRKey> selectByExample(StuCourRExample example);

    int updateByExampleSelective(@Param("record") StuCourRKey record, @Param("example") StuCourRExample example);

    int updateByExample(@Param("record") StuCourRKey record, @Param("example") StuCourRExample example);
}