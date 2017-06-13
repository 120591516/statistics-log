package com.jinpaihushi.mapper;

import com.jinpaihushi.model.Platfrom;
import com.jinpaihushi.model.PlatfromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatfromMapper {
    int countByExample(PlatfromExample example);

    int deleteByExample(PlatfromExample example);

    int deleteByPrimaryKey(String id);

    int insert(Platfrom record);

    int insertSelective(Platfrom record);

    List<Platfrom> selectByExample(PlatfromExample example);

    Platfrom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Platfrom record, @Param("example") PlatfromExample example);

    int updateByExample(@Param("record") Platfrom record, @Param("example") PlatfromExample example);

    int updateByPrimaryKeySelective(Platfrom record);

    int updateByPrimaryKey(Platfrom record);
}