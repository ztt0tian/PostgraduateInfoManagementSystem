package com.system.services.interfaces;

import com.system.model.RewardPunish;
import com.system.model.RewardPunishExample;

import java.util.List;

public interface IRewardPunishService {
    int insertRP(RewardPunish rewardPunish);
    List<RewardPunish> selectRewardPunishByCondition(RewardPunishExample example);
    int deleteRPByCondition(RewardPunishExample example);
    int updateRPByConditionSelective(RewardPunish rewardPunish, RewardPunishExample example);
}
