package com.iwill.mapper;

import com.iwill.example.UserDTOExample;
import com.iwill.model.UserDTO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserDTOExample example);

    int deleteByExample(UserDTOExample example);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    List<UserDTO> selectByExample(UserDTOExample example);

    int updateByExampleSelective(@Param("record") UserDTO record, @Param("example") UserDTOExample example);

    int updateByExample(@Param("record") UserDTO record, @Param("example") UserDTOExample example);
}