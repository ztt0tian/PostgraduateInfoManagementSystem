package com.system.services.impl;

import com.system.model.Specialty;
import com.system.model.SpecialtyExample;
import com.system.services.interfaces.ISpecialtyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mvc.xml","classpath:/config/spring-mybatis.xml"})

public class SpecialtyServiceImplTest {

    @Autowired
    private ISpecialtyService specialtyService;


    @Test
    public void inserSpecialty() {
        Specialty specialty = new Specialty();
        specialty.setSpecialty_desc("专业介绍");
        specialty.setSpecialty_name("计算机科学与技术2");
        specialtyService.inserSpecialty(specialty);
    }

    @Test
    public void selectSpecialtyByCondition() {
        SpecialtyExample specialtyExample = new SpecialtyExample();
        System.out.println(specialtyService.selectSpecialtyByCondition(specialtyExample));
    }

    @Test
    public void updateSpecialtyByExampleSelective() {
        Specialty specialty = new Specialty();
        specialty.setSpecialty_desc("计算机科学与技术专业介绍");
        SpecialtyExample specialtyExample = new SpecialtyExample();
        specialtyExample.createCriteria().andSpecialty_idEqualTo(2);
        specialtyService.updateSpecialtyByExampleSelective(specialty, specialtyExample);
    }

    @Test
    public void deletSpecialtyByCondition() {
        SpecialtyExample specialtyExample = new SpecialtyExample();
        specialtyExample.createCriteria().andSpecialty_idEqualTo(3);
        specialtyService.deletSpecialtyByCondition(specialtyExample);
    }
}