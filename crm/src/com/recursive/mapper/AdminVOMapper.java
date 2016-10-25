package com.recursive.mapper;

import com.recursive.pojo.AdminVO;
import com.recursive.pojo.AdminVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminVOMapper {
    int countByExample(AdminVOExample example);

    int deleteByExample(AdminVOExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminVO record);

    int insertSelective(AdminVO record);

    List<AdminVO> selectByExample(AdminVOExample example);

    AdminVO selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") AdminVO record, @Param("example") AdminVOExample example);

    int updateByExample(@Param("record") AdminVO record, @Param("example") AdminVOExample example);

    int updateByPrimaryKeySelective(AdminVO record);

    int updateByPrimaryKey(AdminVO record);
}