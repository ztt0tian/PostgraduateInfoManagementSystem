package com.system.services.impl;

import com.system.dao.interfaces.RewardPunishMapper;
import com.system.model.RewardPunish;
import com.system.model.RewardPunishExample;
import com.system.services.interfaces.IRewardPunishService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RewardPunishServiceImpl implements IRewardPunishService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private RewardPunishExample example;
    public int insertRP(RewardPunish rewardPunish) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).insertSelective(rewardPunish);
    }

    public List<RewardPunish> selectRewardPunishByCondition(RewardPunishExample example) {

        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).selectByExample(example);
    }

    public List<Integer> getAllPItemIDs() {
        example.clear();
        example.createCriteria().andReward_punish_flagEqualTo(1);
        List<Integer> ids = new ArrayList<Integer>();
        for (RewardPunish rp:selectRewardPunishByCondition(example)
             ) {
            ids.add(rp.getReward_punish_id());
        }
        return ids;
    }

    public List<Integer> getAllRItemIDs() {
        example.clear();
        example.createCriteria().andReward_punish_flagEqualTo(0);
        List<Integer> ids = new ArrayList<Integer>();
        for (RewardPunish rp:selectRewardPunishByCondition(example)
        ) {
            ids.add(rp.getReward_punish_id());
        }
        return ids;
    }

    public int deleteRPByCondition(RewardPunishExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).deleteByExample(example);
    }

    public int updateRPByConditionSelective(RewardPunish rewardPunish, RewardPunishExample example) {
        return sqlSessionFactory.openSession().getMapper(RewardPunishMapper.class).updateByExample(rewardPunish, example);
    }
}
