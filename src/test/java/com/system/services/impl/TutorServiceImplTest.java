package com.system.services.impl;

import com.system.model.Tutor;
import com.system.model.TutorExample;
import com.system.services.interfaces.ITutorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring-mvc.xml","classpath:/config/spring-mybatis.xml"})
public class TutorServiceImplTest {

    @Autowired
    private ITutorService tutorService;
    @Test
    public void inserTutor() {
        Tutor tutor = new Tutor();
        tutor.setTutor_name("潘昊2");
        tutor.setTutor_psw("123456");
        tutorService.inserTutor(tutor);
    }

    @Test
    public void selectByCondition() {
        TutorExample tutorExample = new TutorExample();
        System.out.println(tutorService.selectByCondition(tutorExample));
    }

    @Test
    public void updateTutorByExampleSelective() {
        Tutor tutor = new Tutor();
        tutor.setTutor_name("潘昊222");
        TutorExample tutorExample = new TutorExample();
        tutorExample.createCriteria().andTutor_idEqualTo(1);
        tutorService.updateTutorByExampleSelective(tutor, tutorExample);
    }

    @Test
    public void deletTutorByCondition() {
        TutorExample tutorExample = new TutorExample();
        tutorExample.createCriteria().andTutor_idEqualTo(1);
        tutorService.deletTutorByCondition(tutorExample);
    }
}