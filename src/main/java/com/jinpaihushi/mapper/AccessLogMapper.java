package com.jinpaihushi.mapper;

import com.jinpaihushi.model.AccessLog;
import com.jinpaihushi.model.AccessLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessLogMapper {
    int countByExample(AccessLogExample example);

    int deleteByExample(AccessLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(AccessLog record);

    int insertSelective(AccessLog record);

    List<AccessLog> selectByExample(AccessLogExample example);

    AccessLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AccessLog record, @Param("example") AccessLogExample example);

    int updateByExample(@Param("record") AccessLog record, @Param("example") AccessLogExample example);

    int updateByPrimaryKeySelective(AccessLog record);

    int updateByPrimaryKey(AccessLog record);
}