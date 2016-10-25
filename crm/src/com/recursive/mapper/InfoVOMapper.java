package com.recursive.mapper;

import com.recursive.pojo.InfoVO;
import com.recursive.pojo.InfoVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoVOMapper {
    int countByExample(InfoVOExample example);

    int deleteByExample(InfoVOExample example);

    int deleteByPrimaryKey(Integer salonInfoId);

    int insert(InfoVO record);

    int insertSelective(InfoVO record);

    List<InfoVO> selectByExample(InfoVOExample example);

    InfoVO selectByPrimaryKey(Integer salonInfoId);

    int updateByExampleSelective(@Param("record") InfoVO record, @Param("example") InfoVOExample example);

    int updateByExample(@Param("record") InfoVO record, @Param("example") InfoVOExample example);

    int updateByPrimaryKeySelective(InfoVO record);

    int updateByPrimaryKey(InfoVO record);
}