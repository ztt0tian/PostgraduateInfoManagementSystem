package com.system.dao.interfaces;

import com.system.model.RewardPunish;
import com.system.model.RewardPunishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPunishMapper {
    long countByExample(RewardPunishExample example);

    int deleteByExample(RewardPunishExample example);

    int deleteByPrimaryKey(Integer reward_punish_id);

    int insert(RewardPunish record);

    int insertSelective(RewardPunish record);

    List<RewardPunish> selectByExample(RewardPunishExample example);

    RewardPunish selectByPrimaryKey(Integer reward_punish_id);

    int updateByExampleSelective(@Param("record") RewardPunish record, @Param("example") RewardPunishExample example);

    int updateByExample(@Param("record") RewardPunish record, @Param("example") RewardPunishExample example);

    int updateByPrimaryKeySelective(RewardPunish record);

    int updateByPrimaryKey(RewardPunish record);
}