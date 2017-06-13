package com.jinpaihushi.mapper;

import com.jinpaihushi.model.GoodsUrl;
import com.jinpaihushi.model.GoodsUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsUrlMapper {
    int countByExample(GoodsUrlExample example);

    int deleteByExample(GoodsUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsUrl record);

    int insertSelective(GoodsUrl record);

    List<GoodsUrl> selectByExample(GoodsUrlExample example);

    GoodsUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsUrl record, @Param("example") GoodsUrlExample example);

    int updateByExample(@Param("record") GoodsUrl record, @Param("example") GoodsUrlExample example);

    int updateByPrimaryKeySelective(GoodsUrl record);

    int updateByPrimaryKey(GoodsUrl record);
}