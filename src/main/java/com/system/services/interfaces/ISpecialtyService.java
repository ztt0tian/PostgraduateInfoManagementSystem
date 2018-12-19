package com.system.services.interfaces;


import com.system.model.Specialty;
import com.system.model.SpecialtyExample;
import com.system.model.Tutor;
import com.system.model.TutorExample;

import java.util.List;

public interface ISpecialtyService {
    int inserSpecialty(Specialty specialty);
    List<Specialty> selectSpecialtyByCondition(SpecialtyExample specialtyExample);
    int updateSpecialtyByExampleSelective(Specialty specialty, SpecialtyExample specialtyExample);
    int deletSpecialtyByCondition(SpecialtyExample specialtyExample);
}
