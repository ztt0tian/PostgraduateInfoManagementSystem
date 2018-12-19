package com.system.dao.interfaces;

import com.system.model.RewardPunishRecord;
import com.system.model.RewardPunishRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPunishRecordMapper {
    long countByExample(RewardPunishRecordExample example);

    int deleteByExample(RewardPunishRecordExample example);

    int deleteByPrimaryKey(Integer rp_record_id);

    int insert(RewardPunishRecord record);

    int insertSelective(RewardPunishRecord record);

    List<RewardPunishRecord> selectByExample(RewardPunishRecordExample example);

    RewardPunishRecord selectByPrimaryKey(Integer rp_record_id);

    int updateByExampleSelective(@Param("record") RewardPunishRecord record, @Param("example") RewardPunishRecordExample example);

    int updateByExample(@Param("record") RewardPunishRecord record, @Param("example") RewardPunishRecordExample example);

    int updateByPrimaryKeySelective(RewardPunishRecord record);

    int updateByPrimaryKey(RewardPunishRecord record);
}