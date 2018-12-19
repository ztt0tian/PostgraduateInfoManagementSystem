package com.system.dao.interfaces;

import com.system.model.Class;
import com.system.model.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    long countByExample(ClassExample example);//按条件对符合条件的Class计数

    int deleteByExample(ClassExample example);//按条件删除Class记录

    int deleteByPrimaryKey(Integer class_id);//按主键删除Class记录

    int insert(Class record);//插入Class记录

    int insertSelective(Class record);//选择性保存Class数据

    List<Class> selectByExample(ClassExample example);//按条件找到符合条件的Class List

    Class selectByPrimaryKey(Integer class_id);//按主键查询Class

    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}