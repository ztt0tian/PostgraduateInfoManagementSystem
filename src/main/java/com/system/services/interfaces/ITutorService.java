package com.system.services.interfaces;


import com.system.model.Tutor;
import com.system.model.TutorExample;

import java.util.List;

public interface ITutorService {
    int inserTutor(Tutor tutor);
    List<Tutor> selectByCondition(TutorExample tutorExample);
    int updateTutorByExampleSelective(Tutor tutor, TutorExample example);
    int deletTutorByCondition(TutorExample tutorExample);
}
