package com.system.services.interfaces;

import com.system.model.Term;
import com.system.model.TermExample;

import java.util.List;

public interface ITermSerivice {
    int insertTerm(Term term);
    List<Term> selectTermByCondition(TermExample example);
    int deleteTermByPK(int term_id);
    Term selectTermByPK(int term_id);
}
