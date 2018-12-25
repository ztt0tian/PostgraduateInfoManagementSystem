package com.system.services.impl;

import com.system.dao.interfaces.RewardPunishMapper;
import com.system.model.RewardPunish;
import com.system.model.RewardPunishExample;
import com.system.services.interfaces.IRewardPunishService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RewardPunishServiceImpl implements IRewardPunishService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    public int insertRP(RewardPunish rewardPunish) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).insertSelective(rewardPunish);
    }

    public List<RewardPunish> selectRewardPunishByCondition(RewardPunishExample example) {

        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).selectByExample(example);
    }

    public int deleteRPByCondition(RewardPunishExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).deleteByExample(example);
    }

    public int updateRPByConditionSelective(RewardPunish rewardPunish, RewardPunishExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).updateByExample(rewardPunish, example);
    }
}
