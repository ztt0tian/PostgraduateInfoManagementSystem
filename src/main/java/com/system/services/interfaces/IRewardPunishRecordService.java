package com.system.services.interfaces;

import com.system.model.RewardPunishRecord;
import com.system.model.RewardPunishRecordExample;

import java.util.List;

public interface IRewardPunishRecordService {
    int insertRPrecord(RewardPunishRecord record);
    List<RewardPunishRecord> selectRPrecordByCondition(RewardPunishRecordExample example);
    int deletRPrecordByCondition(RewardPunishRecordExample example);
}
