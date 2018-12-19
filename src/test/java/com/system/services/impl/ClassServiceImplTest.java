package com.system.services.impl;

import com.system.model.Class;
import com.system.model.ClassExample;
import com.system.services.interfaces.IClassService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mvc.xml","classpath:/config/spring-mybatis.xml"})
public class ClassServiceImplTest {

    @Autowired
    private IClassService classService;

    @Autowired
    private ClassExample classExample;
    @Test
    public void insertClass() {
    }

    @Test
    public void countClassByCondition() {
    }

    @Test
    public void deleteClassByCondition() {
    }

    @Test
    public void deleteClassByClassId() {
    }

    @Test
    public void selectClassesByCondition() {
    }

    @Test
    public void insertClassSelective() {
        Class cla = new Class();
        cla.setClass_name("计算123班");
        classService.insertClassSelective(cla);
    }

    @Test
    public void selectClassByPrimaryKey() {
        classService.selectClassByPrimaryKey(17);
    }

    @Test
    public void updateByPrimaryKey() {
        Class record = new Class();
        record.setClass_id(17);
        record.setClass_name("计算机17班");
        record.setClass_nums(50);
        classService.updateByPrimaryKey(record);
    }

    @Test
    public void updateByExampleSelective() {
        Class record = new Class();
        record.setClass_name("计算机统一名称");
        record.setClass_nums(60);
        classExample.createCriteria().andClass_idBetween(18, 20);
        classService.updateByExampleSelective(record, classExample);
    }

    @Test
    public void updateByExample() {
        Class record = new Class();
        record.setClass_name("计算机统一名称");
        record.setClass_nums(60);
        record.setClass_id(12);
        classExample.createCriteria().andClass_idBetween(18, 18);
        classService.updateByExample(record, classExample);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Class record = new Class();
        record.setClass_id(17);
        record.setClass_name("计算机15班");
        classService.updateByPrimaryKeySelective(record);
    }
}