package com.system.services.impl;

import com.system.dao.interfaces.RewardPunishRecordMapper;
import com.system.model.RewardPunishRecord;
import com.system.model.RewardPunishRecordExample;
import com.system.services.interfaces.IRewardPunishRecordService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RewardPunishRecordServiceImpl implements IRewardPunishRecordService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int insertRPrecord(RewardPunishRecord record) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishRecordMapper.class).insertSelective(record);
    }

    public List<RewardPunishRecord> selectRPrecordByCondition(RewardPunishRecordExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishRecordMapper.class).selectByExample(example);
    }

    public int deletRPrecordByCondition(RewardPunishRecordExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishRecordMapper.class).deleteByExample(example);
    }
}
