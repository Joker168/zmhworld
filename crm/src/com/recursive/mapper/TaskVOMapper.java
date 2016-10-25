package com.recursive.mapper;

import com.recursive.pojo.TaskVO;
import com.recursive.pojo.TaskVOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskVOMapper {
    int countByExample(TaskVOExample example);

    int deleteByExample(TaskVOExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskVO record);

    int insertSelective(TaskVO record);

    List<TaskVO> selectByExample(TaskVOExample example);

    TaskVO selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TaskVO record, @Param("example") TaskVOExample example);

    int updateByExample(@Param("record") TaskVO record, @Param("example") TaskVOExample example);

    int updateByPrimaryKeySelective(TaskVO record);

    int updateByPrimaryKey(TaskVO record);
}